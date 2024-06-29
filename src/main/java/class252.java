import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class252 extends class151 {

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "Lsg;")
    public class162 field4536 = new class162();

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "Lql;")
    public class217 field4547 = new class217();

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "Ln;")
    private class16 field4546;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "Lcc;")
    private static class209 field4523 = class95.method669(114, "Please remove ");

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Lcc;")
    public static class209 field4526 = field4523;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "Z")
    public static boolean field4533 = false;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "Lcc;")
    public static class209 field4528 = class95.method669(90, "<col=00ff80>");

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field4537 = 0;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Lcc;")
    public static class209 field4527 = field4523;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "Lcc;")
    public static class209 field4535 = class95.method669(116, "<col=80ff00>");

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "Z")
    public static boolean field4534 = false;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "Lcc;")
    public static class209 field4541 = class95.method669(104, ")4");

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "Lcc;")
    public static class209 field4532 = class95.method669(97, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "[[I")
    public static int[][] field4543;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BILci;)V")
    private final void method1739(byte arg0, int arg1, class243 arg2) {
        if (arg0 != -88) {
            this.method148();
        }
        field4544++;
        if ((this.field4546.field347[arg2.field4405] & 0x4) != 0 && arg2.field4410 < 0) {
            int var4 = this.field4546.field304[arg2.field4405] / class192.field3479;
            int var5 = (var4 + 1048575 - arg2.field4390) / var4;
            arg2.field4390 = arg1 * var4 + arg2.field4390 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field4546.field313[arg2.field4405] == 0) {
                    arg2.field4414 = class121.method861(arg2.field4401, arg2.field4414.method864(), arg2.field4414.method877(), arg2.field4414.method878());
                } else {
                    arg2.field4414 = class121.method861(arg2.field4401, arg2.field4414.method864(), 0, arg2.field4414.method878());
                    this.field4546.method157(arg0 + 14734, arg2, arg2.field4411.field416[arg2.field4389] < 0);
                }
                if (arg2.field4411.field416[arg2.field4389] < 0) {
                    arg2.field4414.method884(-1);
                }
                arg1 = arg2.field4390 / var4;
            }
        }
        arg2.field4414.method133(arg1);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "([III)V")
    public final void method153(int[] arg0, int arg1, int arg2) {
        field4542++;
        this.field4547.method153(arg0, arg1, arg2);
        for (class243 var4 = (class243) this.field4536.method1119(20896); var4 != null; var4 = (class243) this.field4536.method1120(40)) {
            if (!this.field4546.method139(false, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field4388 >= var6) {
                        this.method1743(var5, var6, (byte) 17, var4, arg0, var5 + var6);
                        var4.field4388 -= var6;
                        break;
                    }
                    this.method1743(var5, var4.field4388, (byte) 17, var4, arg0, var5 + var6);
                    var5 += var4.field4388;
                    var6 -= var4.field4388;
                } while (!this.field4546.method165(arg0, (byte) -85, var6, var4, var5));
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(JBLcc;ISLcc;I)V")
    public static final void method1740(long arg0, byte arg1, class209 arg2, int arg3, short arg4, class209 arg5, int arg6) {
        field4545++;
        if (class244.field4418) {
            return;
        }
        if (class98.field1912 < 500) {
            class219.field3993[class98.field1912] = arg2;
            class20.field391[class98.field1912] = arg5;
            class40.field680[class98.field1912] = arg4;
            class111.field2248[class98.field1912] = arg0;
            class106.field2096[class98.field1912] = arg6;
            class52.field1032[class98.field1912] = arg3;
            class98.field1912++;
        }
        if (arg1 != 90) {
            method1741(-49);
        }
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
    public static final void method1741(int arg0) {
        if (arg0 != -28543) {
            field4541 = null;
        }
        field4524++;
        class118.field2364.method665(1);
        class286.field5047.method665(1);
        class5.field75.method665(arg0 + 28544);
        class219.field3992.method665(1);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method1742(byte arg0) {
        field4543 = null;
        field4526 = null;
        field4532 = null;
        field4527 = null;
        field4528 = null;
        if (arg0 > -82) {
            method1742((byte) 10);
        }
        field4535 = null;
        field4541 = null;
        field4523 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()Lmh;")
    public final class151 method137() {
        field4539++;
        class243 var1 = (class243) this.field4536.method1119(20896);
        if (var1 == null) {
            return null;
        } else if (var1.field4414 == null) {
            return this.method148();
        } else {
            return var1.field4414;
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
    public final void method133(int arg0) {
        field4538++;
        this.field4547.method133(arg0);
        for (class243 var2 = (class243) this.field4536.method1119(20896); var2 != null; var2 = (class243) this.field4536.method1120(46)) {
            if (!this.field4546.method139(false, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field4388) {
                        this.method1739((byte) -88, var3, var2);
                        var2.field4388 -= var3;
                        break;
                    }
                    this.method1739((byte) -88, var2.field4388, var2);
                    var3 -= var2.field4388;
                } while (!this.field4546.method165((int[]) null, (byte) -85, var3, var2, 0));
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIBLci;[II)V")
    private final void method1743(int arg0, int arg1, byte arg2, class243 arg3, int[] arg4, int arg5) {
        if ((this.field4546.field347[arg3.field4405] & 0x4) != 0 && arg3.field4410 < 0) {
            int var7 = this.field4546.field304[arg3.field4405] / class192.field3479;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field4390) / var7;
                if (arg1 < var8) {
                    arg3.field4390 += arg1 * var7;
                    break;
                }
                arg1 -= var8;
                arg3.field4414.method153(arg4, arg0, var8);
                class121 var9 = arg3.field4414;
                arg0 += var8;
                arg3.field4390 += var7 * var8 - 1048576;
                int var10 = 262144 / var7;
                int var11 = class192.field3479 / 100;
                if (var11 > var10) {
                    var11 = var10;
                }
                if (this.field4546.field313[arg3.field4405] == 0) {
                    arg3.field4414 = class121.method861(arg3.field4401, var9.method864(), var9.method877(), var9.method878());
                } else {
                    arg3.field4414 = class121.method861(arg3.field4401, var9.method864(), 0, var9.method878());
                    this.field4546.method157(arg2 ^ 0x3927, arg3, arg3.field4411.field416[arg3.field4389] < 0);
                    arg3.field4414.method852(var11, var9.method877());
                }
                if (arg3.field4411.field416[arg3.field4389] < 0) {
                    arg3.field4414.method884(-1);
                }
                var9.method879(var11);
                var9.method153(arg4, arg0, arg5 - arg0);
                if (var9.method890()) {
                    this.field4547.method1522(var9);
                }
            }
        }
        if (arg2 != 17) {
            field4528 = null;
        }
        field4530++;
        arg3.field4414.method153(arg4, arg0, arg1);
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
    public static final void method1744(int arg0) {
        class118.field2364.method664(-117);
        field4540++;
        class286.field5047.method664(arg0 + 127);
        class5.field75.method664(125);
        if (arg0 != 0) {
            field4534 = true;
        }
        class219.field3992.method664(arg0 ^ 0xFFFFFF89);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "()I")
    public final int method163() {
        field4529++;
        return 0;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "()Lmh;")
    public final class151 method148() {
        field4525++;
        class243 var1;
        do {
            var1 = (class243) this.field4536.method1120(105);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4414 == null);
        return var1.field4414;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ln;)V")
    public class252(class16 arg0) {
        this.field4546 = arg0;
    }
}
