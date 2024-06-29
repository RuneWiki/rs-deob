import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class108 {

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field2626 = 1;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Lgd;")
    private static class40 field2623 = class14.method90(false, "Login limit exceeded)3");

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Lgd;")
    public static class40 field2627 = class14.method90(false, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field2624 = -1;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "[I")
    public static int[] field2638 = new int[128];

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Lgd;")
    public static class40 field2641 = class14.method90(false, "(Udns");

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field2643 = 0;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Lgd;")
    private static class40 field2631 = class14.method90(false, "Enter name:");

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Lgd;")
    public static class40 field2630 = field2631;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "Lgd;")
    private static class40 field2642 = class14.method90(false, "To");

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "[[I")
    public static int[][] field2633 = new int[104][104];

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lgd;")
    public static class40 field2625 = field2642;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field2634 = 0;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lgd;")
    public static class40 field2628 = field2623;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "Lgd;")
    private static class40 field2646 = class14.method90(false, "Loaded wordpack");

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "Lgd;")
    public static class40 field2648 = field2646;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "J")
    public long field2647;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Lsa;")
    public class108 field2621;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Lsa;")
    public class108 field2639;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "Lu;")
    public static class123 field2644;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Loc;")
    public static class86 field2622;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLgd;Lrb;Lgd;)Lhe;", line = 8)
    public static final class47 method829(byte arg0, class40 arg1, class103 arg2, class40 arg3) {
        if (arg0 == -79) {
            field2632++;
            int var4 = arg2.method749(arg3, 1);
            int var5 = arg2.method740(var4, false, arg1);
            return class131.method1035((byte) -114, arg2, var4, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)Z", line = 24)
    public final boolean method830(int arg0) {
        field2629++;
        if (arg0 == 2) {
            return this.field2639 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILqa;)V", line = 42)
    public static final void method831(int arg0, int arg1, int arg2, class96 arg3) {
        if ((arg2 & 0x100) != 0) {
            arg3.field827 = class100.field2376.method760((byte) 88);
            int var4 = class100.field2376.method774(-29404);
            arg3.field795 = var4 >> 16;
            if (arg3.field827 == 65535) {
                arg3.field827 = -1;
            }
            arg3.field832 = 0;
            arg3.field776 = (var4 & 0xFFFF) + class10.field242;
            arg3.field806 = 0;
            if (arg3.field776 > class10.field242) {
                arg3.field806 = -1;
            }
        }
        if ((arg2 & 0x1) != 0) {
            int var5 = class100.field2376.method797(-7916);
            int var6 = class100.field2376.method758(106);
            int var7 = class100.field2376.method758(40);
            int var8 = class100.field2376.field2563;
            if (arg3.field2210 != null && arg3.field2217 != null) {
                long var9 = arg3.field2210.method246(-88);
                boolean var11 = false;
                if (var6 <= 1) {
                    for (int var12 = 0; var12 < class42.field1065; var12++) {
                        if (class67.field1657[var12] == var9) {
                            var11 = true;
                            break;
                        }
                    }
                }
                if (!var11 && class55.field1405 == 0) {
                    class86.field1922.field2563 = 0;
                    class100.field2376.method753(var7, 0, false, class86.field1922.field2554);
                    class86.field1922.field2563 = 0;
                    class40 var13 = class9.method49((byte) 63, class86.field1922).method257(122);
                    arg3.field796 = var13.method259((byte) 105);
                    arg3.field836 = var5 >> 8;
                    arg3.field810 = var5 & 0xFF;
                    arg3.field817 = 150;
                    if (var6 == 2 || var6 == 3) {
                        class77.method521(client.method114(true, new class40[] { class55.field1408, arg3.field2210 }), var13, false, 1);
                    } else if (var6 == 1) {
                        class77.method521(client.method114(true, new class40[] { class7.field196, arg3.field2210 }), var13, false, 1);
                    } else {
                        class77.method521(arg3.field2210, var13, false, 2);
                    }
                }
            }
            class100.field2376.field2563 = var7 + var8;
        }
        field2637++;
        if ((arg2 & 0x40) != 0) {
            arg3.field766 = class100.field2376.method757((byte) 117);
            if (arg3.field766 == 65535) {
                arg3.field766 = -1;
            }
        }
        if ((arg2 & 0x80) != 0) {
            arg3.field796 = class100.field2376.method765(13101);
            if (arg3.field796.method249((byte) -85, 0) == 126) {
                arg3.field796 = arg3.field796.method240(-28427, 1);
                class77.method521(arg3.field2210, arg3.field796, false, 2);
            } else if (class13.field332 == arg3) {
                class77.method521(arg3.field2210, arg3.field796, false, 2);
            }
            arg3.field810 = 0;
            arg3.field817 = 150;
            arg3.field836 = 0;
        }
        if ((arg2 & 0x400) != 0) {
            int var14 = class100.field2376.method795(694);
            int var15 = class100.field2376.method758(31);
            arg3.method199(class10.field242, var14, var15, 12765);
            arg3.field764 = class10.field242 + 300;
            arg3.field834 = class100.field2376.method800((byte) -13);
            arg3.field765 = class100.field2376.method795(694);
        }
        if ((arg2 & 0x200) != 0) {
            arg3.field786 = class100.field2376.method758(10);
            arg3.field775 = class100.field2376.method795(694);
            arg3.field809 = class100.field2376.method800((byte) -13);
            arg3.field835 = class100.field2376.method800((byte) -13);
            arg3.field826 = class100.field2376.method797(-7916) + class10.field242;
            arg3.field822 = class100.field2376.method810((byte) -59) + class10.field242;
            arg3.field800 = class100.field2376.method758(60);
            arg3.method202(7);
        }
        if ((arg2 & 0x10) != 0) {
            int var16 = class100.field2376.method798((byte) -57);
            int var17 = class100.field2376.method758(72);
            arg3.method199(class10.field242, var16, var17, 12765);
            arg3.field764 = class10.field242 + 300;
            arg3.field834 = class100.field2376.method795(694);
            arg3.field765 = class100.field2376.method800((byte) -13);
        }
        if ((arg2 & 0x20) != 0) {
            int var18 = class100.field2376.method758(60);
            byte[] var19 = new byte[var18];
            class104 var20 = new class104(var19);
            class100.field2376.method783(var18, 0, var19, (byte) 124);
            class35.field897[arg1] = var20;
            arg3.method650(256, var20);
        }
        if ((arg2 & 0x4) != 0) {
            int var21 = class100.field2376.method757((byte) 94);
            if (var21 == 65535) {
                var21 = -1;
            }
            int var22 = class100.field2376.method795(694);
            class61.method449(var22, arg3, (byte) -22, var21);
        }
        if ((arg2 & 0x8) != 0) {
            arg3.field784 = class100.field2376.method810((byte) -113);
            arg3.field774 = class100.field2376.method810((byte) -57);
        }
        if (arg0 <= 106) {
            field2626 = -94;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V", line = 249)
    public static void method832(boolean arg0) {
        field2638 = null;
        field2628 = null;
        field2622 = null;
        field2648 = null;
        field2644 = null;
        field2641 = null;
        field2623 = null;
        field2642 = null;
        field2625 = null;
        field2631 = null;
        if (!arg0) {
            field2627 = null;
            field2630 = null;
            field2646 = null;
            field2633 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V", line = 294)
    public final void method833(int arg0) {
        field2635++;
        if (this.field2639 != null && arg0 == 4) {
            this.field2639.field2621 = this.field2621;
            this.field2621.field2639 = this.field2639;
            this.field2639 = null;
            this.field2621 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)Lue;", line = 320)
    public static final class125 method834(boolean arg0, int arg1) {
        class125 var2 = (class125) class101.field2401.method39(58, (long) arg1);
        field2640++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class1.field7.method731(arg1, 14, (byte) -107);
        class125 var4 = new class125();
        if (arg0) {
            field2623 = null;
        }
        if (var3 != null) {
            var4.method995(!arg0, new class104(var3));
        }
        class101.field2401.method38(var4, (long) arg1, true);
        return var4;
    }
}
