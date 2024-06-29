import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class272 extends class122 {

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "Z")
    public volatile boolean field4515 = true;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "[[I")
    public static int[][] field4514 = new int[104][104];

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "I")
    public static int field4517 = 0;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    public static int field4520 = 0;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "Lqd;")
    public static class40 field4518 = class147.method1106("Texturen geladen)3", (byte) -75);

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    public static int field4521 = 1;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "Z")
    public boolean field4523;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "Z")
    public boolean field4525;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "[I")
    public static int[] field4513;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lce;III)Z", line = 10)
    public static final boolean method1881(class239 arg0, int arg1, int arg2, int arg3) {
        field4516++;
        byte[] var4 = arg0.method1651(arg2, arg1, -1);
        if (arg3 != 929) {
            return true;
        } else if (var4 == null) {
            return false;
        } else {
            class10.method63(var4, (byte) -117);
            return true;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(III)Lak;", line = 30)
    public static final class302 method1882(int arg0, int arg1, int arg2) {
        class14 var3 = class93.field1690[arg0][arg1][arg2];
        return var3 == null ? null : var3.field235;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V", line = 38)
    public static void method1883(byte arg0) {
        field4513 = null;
        field4518 = null;
        field4514 = (int[][]) null;
        if (arg0 != -39) {
            method1883((byte) -10);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lqd;Lrb;I)Lqd;", line = 57)
    public static final class40 method1884(class40 arg0, class213 arg1, int arg2) {
        field4519++;
        if (arg0.method358(-118, class53.field1031) != -1) {
            label67: while (true) {
                int var3 = arg0.method358(-124, class217.field3620);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method358(-117, class90.field1625);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method358(-126, class211.field3360);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method358(-119, class25.field436);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method358(-125, class277.field4679);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method358(-120, class49.field946);
                                                        if (var8 == -1) {
                                                            break label67;
                                                        }
                                                        class40 var9 = class264.field4421;
                                                        if (class193.field3119 != null) {
                                                            var9 = class217.method1522(class193.field3119.field1259, (byte) 103);
                                                            try {
                                                                if (class193.field3119.field1260 != null) {
                                                                    byte[] var10 = ((String) class193.field3119.field1260).getBytes("ISO-8859-1");
                                                                    var9 = class34.method298(var10, -22277, var10.length, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg0 = class153.method1192(new class40[] { arg0.method333(0, 62, var8), var9, arg0.method371(var8 + 4, false) }, (byte) 125);
                                                    }
                                                }
                                                arg0 = class153.method1192(new class40[] { arg0.method333(0, 38, var7), class106.method797(class208.method1472(4, arg1, true), -101), arg0.method371(var7 + 2, false) }, (byte) 124);
                                            }
                                        }
                                        arg0 = class153.method1192(new class40[] { arg0.method333(0, 93, var6), class106.method797(class208.method1472(3, arg1, true), -101), arg0.method371(var6 + 2, false) }, (byte) 123);
                                    }
                                }
                                arg0 = class153.method1192(new class40[] { arg0.method333(0, 24, var5), class106.method797(class208.method1472(2, arg1, true), -101), arg0.method371(var5 + 2, false) }, (byte) 127);
                            }
                        }
                        arg0 = class153.method1192(new class40[] { arg0.method333(0, 47, var4), class106.method797(class208.method1472(1, arg1, true), -101), arg0.method371(var4 + 2, false) }, (byte) 125);
                    }
                }
                arg0 = class153.method1192(new class40[] { arg0.method333(0, 26, var3), class106.method797(class208.method1472(0, arg1, true), -101), arg0.method371(var3 + 2, false) }, (byte) 28);
            }
        }
        if (arg2 < 107) {
            method1881((class239) null, -79, 2, 19);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)I")
    public abstract int method290(byte arg0);

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)[B")
    public abstract byte[] method289(byte arg0);
}
