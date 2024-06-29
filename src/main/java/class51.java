import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class51 {

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "Lcq;")
    public static class110 field510 = new class110(97, 8);

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    public static int field514 = 0;

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method263(int arg0, int arg1) {
        field511++;
        int var2 = -45 % ((-arg1 - 6) / 58);
        if (arg0 == 100 && class691.field9710 > 0) {
            byte[] var3 = class249.field3106[--class691.field9710];
            class249.field3106[class691.field9710] = null;
            return var3;
        } else if (arg0 == 5000 && class418.field5590 > 0) {
            byte[] var4 = class169.field1889[--class418.field5590];
            class169.field1889[class418.field5590] = null;
            return var4;
        } else if (arg0 == 30000 && class290.field3635 > 0) {
            byte[] var5 = class474.field6835[--class290.field3635];
            class474.field6835[class290.field3635] = null;
            return var5;
        } else {
            if (class664.field9292 != null) {
                for (int var6 = 0; var6 < class185.field2096.length; var6++) {
                    if (class185.field2096[var6] == arg0 && class560.field7995[var6] > 0) {
                        byte[] var7 = class664.field9292[var6][--class560.field7995[var6]];
                        class664.field9292[var6][class560.field7995[var6]] = null;
                        return var7;
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
    public static void method264(int arg0) {
        field510 = null;
        if (arg0 != 0) {
            field510 = null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "([BI)V")
    public static final synchronized void method265(byte[] arg0, int arg1) {
        field513++;
        if (arg0.length == 100 && class691.field9710 < 1000) {
            class249.field3106[class691.field9710++] = arg0;
            return;
        }
        if (arg1 != -9) {
            field510 = null;
        }
        if (arg0.length == 5000 && class418.field5590 < 250) {
            class169.field1889[class418.field5590++] = arg0;
        } else if (arg0.length == 30000 && class290.field3635 < 50) {
            class474.field6835[class290.field3635++] = arg0;
        } else if (class664.field9292 != null) {
            for (int var2 = 0; var2 < class185.field2096.length; var2++) {
                if (class185.field2096[var2] == arg0.length && class664.field9292[var2].length > class560.field7995[var2]) {
                    class664.field9292[var2][class560.field7995[var2]++] = arg0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BII)Z")
    public static final boolean method266(byte arg0, int arg1, int arg2) {
        field512++;
        if (!class188.field2148) {
            return false;
        }
        int var3 = -98 / ((arg0 - 8) / 61);
        int var4 = arg2 >> 16;
        int var5 = arg2 & 0xFFFF;
        if (class102.field1106[var4] == null || class102.field1106[var4][var5] == null) {
            return false;
        }
        class452 var6 = class102.field1106[var4][var5];
        if (arg1 == -1 && var6.field6471 == 0) {
            for (class336 var7 = (class336) class694.field9730.method3434((byte) 2); var7 != null; var7 = (class336) class694.field9730.method3430(true)) {
                if (var7.field4231 == 3 || var7.field4231 == 1007 || var7.field4231 == 8 || var7.field4231 == 10 || var7.field4231 == 59) {
                    for (class452 var8 = class92.method464(var7.field4228, -167823504); var8 != null; var8 = class411.method2304(var8, false)) {
                        if (var6.field6339 == var8.field6339) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class336 var9 = (class336) class694.field9730.method3434((byte) 2); var9 != null; var9 = (class336) class694.field9730.method3430(true)) {
                if (var9.field4230 == arg1 && var6.field6339 == var9.field4228 && (var9.field4231 == 3 || var9.field4231 == 1007 || var9.field4231 == 8 || var9.field4231 == 10 || var9.field4231 == 59)) {
                    return true;
                }
            }
        }
        return false;
    }
}
