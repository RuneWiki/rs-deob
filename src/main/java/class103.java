import java.io.IOException;
import java.util.Random;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class103 {

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Luf;")
    public static class168 field1596 = class148.method1019(-1720, ": ");

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field1594 = 0;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Z")
    public static volatile boolean field1602 = false;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Luf;")
    public static class168 field1603 = class148.method1019(-1720, "<col=ffb000>");

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Lej;")
    public static class204 field1604 = new class204(64);

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "[I")
    public static int[] field1605 = new int[128];

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Lga;")
    public static class145 field1601;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()V", line = 7)
    public static final void method771() {
        GL var0 = class90.field1390;
        var0.glDisableClientState(32886);
        class90.method624(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class90.method619();
        for (int var1 = 0; var1 < class46.field562[0].length; var1++) {
            class192 var2 = class46.field562[0][var1];
            if (var2.field3124 >= 0 && class173.field2815.method513(var2.field3124, 0) == 4) {
                var0.glColor4fv(class196.method1379((byte) 76, var2.field3123), 0);
                float var3 = 201.5F - (var2.field3133 ? 1.0F : 0.5F);
                var2.method1355(class92.field1424, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class90.method637();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class90.method642();
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)Lt;", line = 44)
    public static final class224 method772(byte arg0, int arg1) {
        field1598++;
        if (arg0 != 9) {
            field1604 = (class204) null;
        }
        if (arg1 == 0) {
            return new class229();
        } else if (arg1 == 1) {
            return new class57();
        } else if (arg1 == 2) {
            return new class122();
        } else if (arg1 == 3) {
            return new class38();
        } else if (arg1 == 4) {
            return new class252();
        } else if (arg1 == 5) {
            return new class105();
        } else if (arg1 == 6) {
            return new class245();
        } else if (arg1 == 7) {
            return new class234();
        } else if (arg1 == 8) {
            return new class17();
        } else if (arg1 == 9) {
            return new class267();
        } else if (arg1 == 10) {
            return new class162();
        } else if (arg1 == 11) {
            return new class289();
        } else if (arg1 == 12) {
            return new class157();
        } else if (arg1 == 13) {
            return new class115();
        } else if (arg1 == 14) {
            return new class21();
        } else if (arg1 == 15) {
            return new class280();
        } else if (arg1 == 16) {
            return new class303();
        } else if (arg1 == 17) {
            return new class70();
        } else if (arg1 == 18) {
            return new class219();
        } else if (arg1 == 19) {
            return new class119();
        } else if (arg1 == 20) {
            return new class259();
        } else if (arg1 == 21) {
            return new class25();
        } else if (arg1 == 22) {
            return new class126();
        } else if (arg1 == 23) {
            return new class6();
        } else if (arg1 == 24) {
            return new class65();
        } else if (arg1 == 25) {
            return new class248();
        } else if (arg1 == 26) {
            return new class270();
        } else if (arg1 == 27) {
            return new class133();
        } else if (arg1 == 28) {
            return new class150();
        } else if (arg1 == 29) {
            return new class236();
        } else if (arg1 == 30) {
            return new class225();
        } else if (arg1 == 31) {
            return new class107();
        } else if (arg1 == 32) {
            return new class48();
        } else if (arg1 == 33) {
            return new class78();
        } else if (arg1 == 34) {
            return new class52();
        } else if (arg1 == 35) {
            return new class156();
        } else if (arg1 == 36) {
            return new class177();
        } else if (arg1 == 37) {
            return new class83();
        } else if (arg1 == 38) {
            return new class46();
        } else if (arg1 == 39) {
            return new class275();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 385)
    public static void method773(int arg0) {
        field1596 = null;
        field1605 = null;
        if (arg0 != -14980) {
            method772((byte) 40, 1);
        }
        field1604 = null;
        field1601 = null;
        field1603 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 402)
    public static final int method774(int arg0, Random arg1, int arg2) {
        field1595++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class138.method955(arg0, arg2 - 2147483582)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            int var3 = arg2 - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class190.method1351(107, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZBLe;)V", line = 435)
    public static final void method775(boolean arg0, byte arg1, class169 arg2) {
        field1599++;
        if (class270.field4537 != null) {
            try {
                class270.field4537.method1229(545);
            } catch (Exception var11) {
            }
            class270.field4537 = null;
        }
        class270.field4537 = arg2;
        class155.method1106(arg0, (byte) -88);
        class138.field2125.field2367 = 0;
        class101.field1576 = null;
        class18.field215 = 0;
        class23.field285 = null;
        while (true) {
            class221 var4 = (class221) class65.field869.method499((byte) -99);
            if (var4 == null) {
                while (true) {
                    class221 var5 = (class221) class206.field3383.method499((byte) -99);
                    if (var5 == null) {
                        if (class303.field5102 != 0) {
                            try {
                                class153 var6 = new class153(4);
                                var6.method1095(4, -72);
                                var6.method1095(class303.field5102, -63);
                                var6.method1047(-1, 0);
                                class270.field4537.method1233((byte) 125, var6.field2359, 4, 0);
                            } catch (IOException var10) {
                                try {
                                    class270.field4537.method1229(545);
                                } catch (Exception var9) {
                                }
                                class214.field3497++;
                                class270.field4537 = null;
                            }
                        }
                        class279.field4688 = 0;
                        class294.field4989 = class194.method1368((byte) -111);
                        if (arg1 >= -16) {
                            method775(true, (byte) 33, (class169) null);
                        }
                        return;
                    }
                    class5.field71.method1889(var5, -124);
                    class272.field4578.method490(var5, var5.field292, true);
                    class242.field3967--;
                    class189.field3007++;
                }
            }
            class143.field2199.method490(var4, var4.field292, true);
            class233.field3740--;
            class43.field527++;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLdk;)I", line = 509)
    public static final int method776(boolean arg0, class241 arg1) {
        if (!arg0) {
            return 109;
        }
        field1597++;
        int var2 = 0;
        if (arg1.method1648(class85.field1325, false)) {
            var2++;
        }
        if (arg1.method1648(class198.field3277, !arg0)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ldk;IIZ)[Lsk;", line = 533)
    public static final class193[] method777(class241 arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            return (class193[]) null;
        } else {
            field1600++;
            return class28.method148(arg1, arg0, arg2, -38) ? class281.method1942((byte) 43) : null;
        }
    }
}
