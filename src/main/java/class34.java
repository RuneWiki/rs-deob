import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class34 extends class241 {

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field809 = 5063219;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Loh;")
    public static class263 field808 = class253.method1681(-125, "welle:");

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Loh;")
    public static class263 field807 = class253.method1681(-124, "Benutzen");

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field811 = 0;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "Lfk;")
    public static class14 field814;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
    public static void method218(int arg0) {
        field814 = null;
        field807 = null;
        if (arg0 != 0) {
            field808 = null;
        }
        field808 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V")
    public static final void method219(int arg0, byte arg1) {
        int var2 = -122 / ((75 - arg1) / 37);
        for (class182 var3 = (class182) class141.field2587.method38(24172); var3 != null; var3 = (class182) class141.field2587.method36(106)) {
            if ((var3.field4226 >> 48 & 0xFFFFL) == ((long) arg0)) {
                var3.method1614(-1204826926);
            }
        }
        field813++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)V")
    public static final void method220(byte arg0, int arg1) {
        class182.field3299 = -1;
        field812++;
        class182.field3299 = -1;
        class113.field2115 = arg1;
        int var2 = 62 % ((arg0 + 82) / 37);
        class1.method4((byte) 113);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLah;)V")
    public static final void method221(byte arg0, class267 arg1) {
        arg1.field4652 = arg1.field4687;
        field815++;
        if (arg1.field4711 == 0) {
            arg1.field4704 = 0;
            return;
        }
        if (arg1.field4694 != -1 && arg1.field4662 == 0) {
            class240 var2 = class186.method1226(12828, arg1.field4694);
            if (arg1.field4658 > 0 && var2.field4210 == 0) {
                arg1.field4704++;
                return;
            }
            if (arg1.field4658 <= 0 && var2.field4198 == 0) {
                arg1.field4704++;
                return;
            }
        }
        int var3 = arg1.field4705;
        int var4 = arg1.field4688;
        int var5 = arg1.field4714[arg1.field4711 - 1] * 128 + (arg1.method898(126) * 64);
        int var6 = arg1.field4713[arg1.field4711 - 1] * 128 + arg1.method898(30) * 64;
        if (var5 - var4 > 256 || (var5 - var4) < -256 || var6 - var3 > 256 || var6 - var3 < -256) {
            arg1.field4705 = var6;
            arg1.field4688 = var5;
            return;
        }
        int var7 = arg1.field4675;
        if (var4 < var5) {
            if (var3 < var6) {
                arg1.field4674 = 1280;
            } else if (var6 >= var3) {
                arg1.field4674 = 1536;
            } else {
                arg1.field4674 = 1792;
            }
        } else if (var5 < var4) {
            if (var6 > var3) {
                arg1.field4674 = 768;
            } else if (var3 <= var6) {
                arg1.field4674 = 512;
            } else {
                arg1.field4674 = 256;
            }
        } else if (var6 > var3) {
            arg1.field4674 = 1024;
        } else if (var6 < var3) {
            arg1.field4674 = 0;
        }
        int var8 = arg1.field4674 - arg1.field4700 & 0x7FF;
        int var9 = 4;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg1.field4651;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg1.field4649;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg1.field4676;
        }
        boolean var10 = true;
        if (arg0 != 6) {
            return;
        }
        if (var7 == -1) {
            var7 = arg1.field4651;
        }
        arg1.field4652 = var7;
        if (arg1 instanceof class90) {
            var10 = ((class90) arg1).field1787.field3655;
        }
        if (var10) {
            if (arg1.field4700 != arg1.field4674 && arg1.field4693 == -1 && arg1.field4710 != 0) {
                var9 = 2;
            }
            if (arg1.field4711 > 2) {
                var9 = 6;
            }
            if (arg1.field4711 > 3) {
                var9 = 8;
            }
            if (arg1.field4704 > 0 && arg1.field4711 > 1) {
                arg1.field4704--;
                var9 = 8;
            }
        } else {
            if (arg1.field4711 > 1) {
                var9 = 6;
            }
            if (arg1.field4711 > 2) {
                var9 = 8;
            }
            if (arg1.field4704 > 0 && arg1.field4711 > 1) {
                var9 = 8;
                arg1.field4704--;
            }
        }
        if (arg1.field4667[arg1.field4711 - 1]) {
            var9 <<= 0x1;
        }
        if (var6 > var3) {
            arg1.field4705 += var9;
            if (var6 < arg1.field4705) {
                arg1.field4705 = var6;
            }
        } else if (var3 > var6) {
            arg1.field4705 -= var9;
            if (var6 > arg1.field4705) {
                arg1.field4705 = var6;
            }
        }
        if (var9 >= 8 && arg1.field4652 == arg1.field4651 && arg1.field4707 != -1) {
            arg1.field4652 = arg1.field4707;
        }
        if (var5 > var4) {
            arg1.field4688 += var9;
            if (var5 < arg1.field4688) {
                arg1.field4688 = var5;
            }
        } else if (var4 > var5) {
            arg1.field4688 -= var9;
            if (arg1.field4688 < var5) {
                arg1.field4688 = var5;
            }
        }
        if (arg1.field4688 != var5 || arg1.field4705 != var6) {
            return;
        }
        arg1.field4711--;
        if (arg1.field4658 > 0) {
            arg1.field4658--;
            return;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(II)V")
    public class34(int arg0, int arg1) {
        this.field816 = arg0;
        this.field810 = arg1;
    }
}
