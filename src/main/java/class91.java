import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class91 {

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "Lec;")
    public static class99 field1321 = new class99(5);

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "[Lf;")
    public static class345[] field1323 = new class345[4];

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "J")
    public long field1318;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Lfc;")
    public class110 field1315;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "Lfc;")
    public class110 field1319;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "Lfc;")
    public class110 field1322;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BJ)V", line = 14)
    public static final void method658(byte arg0, long arg1) {
        if (arg0 > -57) {
            method660(24, (byte) -20);
        }
        field1313++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class153.field2321; var3++) {
            if (class162.field2626[var3] == arg1) {
                class153.field2321--;
                class293.field4523++;
                for (int var4 = var3; var4 < class153.field2321; var4++) {
                    class162.field2626[var4] = class162.field2626[var4 + 1];
                    class102.field1469[var4] = class102.field1469[var4 + 1];
                    class339.field5266[var4] = class339.field5266[var4 + 1];
                }
                class338.field5255 = class12.field155;
                class85.field1236.method1141((byte) 99, 210);
                class85.field1236.method1738((byte) 42, arg1);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZIB)I", line = 59)
    public static final int method659(int arg0, boolean arg1, int arg2, byte arg3) {
        field1314++;
        class130 var4 = (class130) class29.field355.method1716(-1, (long) arg0);
        if (arg3 > -5) {
            field1321 = (class99) null;
        }
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field1995.length; var6++) {
            if (var4.field1995[var6] >= 0 && class12.field153 > var4.field1995[var6]) {
                class108 var7 = class222.method1576(var4.field1995[var6], (byte) 92);
                if (var7.field1610 != null) {
                    class293 var8 = (class293) var7.field1610.method1716(-1, (long) arg2);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field1998[var6] * var8.field4519;
                        } else {
                            var5 += var8.field4519;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IB)V", line = 109)
    public static final void method660(int arg0, byte arg1) {
        int var2 = 89 / ((-arg1 - 36) / 62);
        class67.field966.method741(arg0, (byte) 10);
        class35.field509.method741(arg0, (byte) -119);
        field1312++;
        class65.field938.method741(arg0, (byte) 121);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 125)
    public static void method661(int arg0) {
        field1321 = null;
        if (arg0 > 66) {
            field1323 = null;
        }
    }
}
