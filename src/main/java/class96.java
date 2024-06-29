import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class96 {

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "Z")
    public static boolean field1612 = false;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZLck;)V", line = 4)
    public static final void method733(int arg0, boolean arg1, class452 arg2) {
        field1614++;
        boolean var3 = arg2.method2700((byte) 87, 1) == 1;
        if (arg1) {
            field1612 = false;
        }
        if (var3) {
            class35.field674[class29.field633++] = arg0;
        }
        int var4 = arg2.method2700((byte) 87, 2);
        class256 var5 = class183.field2747[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field3691 = false;
            } else if (class148.field2368 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class382 var6 = class167.field2601[arg0] = new class382();
                var6.field5782 = (class403.field6059 + var5.field7694[0] >> 6) + (var5.field7692[0] + class200.field2931 >> 6 << 14) + (var5.field6232 << 28);
                if (var5.field3726 == -1) {
                    var6.field5781 = var5.field7676.method2114(0);
                } else {
                    var6.field5781 = var5.field3726;
                }
                var6.field5783 = var5.field3685;
                var6.field5786 = var5.field7602;
                if (var5.field3709 > 0) {
                    class451.method2686(var5, 0);
                }
                class183.field2747[arg0] = null;
                if (arg2.method2700((byte) 87, 1) != 0) {
                    class134.method1001(0, arg2, arg0);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method2700((byte) 87, 3);
            int var8 = var5.field7692[0];
            int var9 = var5.field7694[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field3691 = true;
                var5.field3724 = var8;
                var5.field3704 = var9;
            } else {
                var5.method1656(var9, var8, class515.field7582[arg0], (byte) 19);
            }
        } else if (var4 == 2) {
            int var10 = arg2.method2700((byte) 87, 4);
            int var11 = var5.field7692[0];
            int var12 = var5.field7694[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field3691 = true;
                var5.field3704 = var12;
                var5.field3724 = var11;
            } else {
                var5.method1656(var12, var11, class515.field7582[arg0], (byte) 19);
            }
        } else {
            int var13 = arg2.method2700((byte) 87, 1);
            if (var13 == 0) {
                int var14 = arg2.method2700((byte) 87, 12);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field7692[0] + var16;
                int var19 = var5.field7694[0] + var17;
                if (var3) {
                    var5.field3704 = var19;
                    var5.field3691 = true;
                    var5.field3724 = var18;
                } else {
                    var5.method1656(var19, var18, class515.field7582[arg0], (byte) 19);
                }
                var5.field6232 = (byte) (var5.field6232 + var15 & 0x3);
                if (class148.field2368 == arg0) {
                    class163.field2525 = var5.field6232;
                }
            } else {
                int var20 = arg2.method2700((byte) 87, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field7692[0] + class200.field2931 + var22 & 0x3FFF) - class200.field2931;
                int var25 = (var5.field7694[0] + class403.field6059 + var23 & 0x3FFF) - class403.field6059;
                if (var3) {
                    var5.field3724 = var24;
                    var5.field3704 = var25;
                    var5.field3691 = true;
                } else {
                    var5.method1656(var25, var24, class515.field7582[arg0], (byte) 19);
                }
                var5.field6232 = (byte) (var5.field6232 + var21 & 0x3);
                if (class148.field2368 == arg0) {
                    class163.field2525 = var5.field6232;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I", line = 328)
    public static final int method734(byte arg0) {
        field1611++;
        if ((double) class509.field7492 == 3.0D) {
            return 37;
        } else if (arg0 != -127) {
            return -85;
        } else if ((double) class509.field7492 == 4.0D) {
            return 50;
        } else if ((double) class509.field7492 == 6.0D) {
            return 75;
        } else if ((double) class509.field7492 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }
}
