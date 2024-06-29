import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class315 extends class105 {

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public static int field4678 = 0;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "Lth;")
    public static class57 field4680 = new class57(64);

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public static int field4682 = 0;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "Ljava/lang/String;")
    public static String field4684 = "Loaded update list";

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(II)Lub;", line = 5)
    public static final class76 method2197(int arg0, int arg1) {
        field4685++;
        if (arg1 < 1) {
            return (class76) null;
        }
        class76 var2 = (class76) class137.field1983.method551(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class329.field4953.method2520(class358.method2482(7337, arg0), class120.method896((byte) 71, arg0), (byte) -25);
        class76 var4 = new class76();
        if (var3 != null) {
            var4.method624(0, new class190(var3));
        }
        class137.field1983.method547((long) arg0, -1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V", line = 28)
    public static final void method2198(int arg0) {
        class121.field1697.method462(24);
        if (arg0 == 661) {
            field4681++;
        }
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "()V", line = 40)
    public static final void method2199() {
        class81.field1154 = 0;
        label194: for (int var0 = 0; var0 < class132.field1926; var0++) {
            class252 var1 = class294.field4430[var0];
            if (class134.field1954 != null) {
                for (int var2 = 0; var2 < class134.field1954.length; var2++) {
                    if (class134.field1954[var2] != -1000000 && (var1.field3739 <= class134.field1954[var2] || var1.field3743 <= class134.field1954[var2]) && (var1.field3745 <= class75.field1098[var2] || var1.field3740 <= class75.field1098[var2]) && (var1.field3745 >= class47.field715[var2] || var1.field3740 >= class47.field715[var2]) && (var1.field3755 <= class58.field856[var2] || var1.field3747 <= class58.field856[var2]) && (var1.field3755 >= class129.field1870[var2] || var1.field3747 >= class129.field1870[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field3753 == 1) {
                int var3 = var1.field3760 + class261.field3975 - class351.field5419;
                if (var3 >= 0 && var3 <= class261.field3975 + class261.field3975) {
                    int var4 = var1.field3752 + class261.field3975 - class294.field4433;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3731 + class261.field3975 - class294.field4433;
                    if (var5 > class261.field3975 + class261.field3975) {
                        var5 = class261.field3975 + class261.field3975;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class322.field4852[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class7.field142 - var1.field3745;
                        if (var7 > 32) {
                            var1.field3750 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3750 = 2;
                            var7 = -var7;
                        }
                        var1.field3761 = (var1.field3755 - class126.field1843 << 8) / var7;
                        var1.field3741 = (var1.field3747 - class126.field1843 << 8) / var7;
                        var1.field3738 = (var1.field3739 - class253.field3770 << 8) / var7;
                        var1.field3736 = (var1.field3743 - class253.field3770 << 8) / var7;
                        class193.field2814[class81.field1154++] = var1;
                    }
                }
            } else if (var1.field3753 == 2) {
                int var8 = var1.field3752 + class261.field3975 - class294.field4433;
                if (var8 >= 0 && var8 <= class261.field3975 + class261.field3975) {
                    int var9 = var1.field3760 + class261.field3975 - class351.field5419;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3749 + class261.field3975 - class351.field5419;
                    if (var10 > class261.field3975 + class261.field3975) {
                        var10 = class261.field3975 + class261.field3975;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class322.field4852[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class126.field1843 - var1.field3755;
                        if (var12 > 32) {
                            var1.field3750 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3750 = 4;
                            var12 = -var12;
                        }
                        var1.field3751 = (var1.field3745 - class7.field142 << 8) / var12;
                        var1.field3754 = (var1.field3740 - class7.field142 << 8) / var12;
                        var1.field3738 = (var1.field3739 - class253.field3770 << 8) / var12;
                        var1.field3736 = (var1.field3743 - class253.field3770 << 8) / var12;
                        class193.field2814[class81.field1154++] = var1;
                    }
                }
            } else if (var1.field3753 == 4) {
                int var13 = var1.field3739 - class253.field3770;
                if (var13 > 128) {
                    int var14 = var1.field3752 + class261.field3975 - class294.field4433;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3731 + class261.field3975 - class294.field4433;
                    if (var15 > class261.field3975 + class261.field3975) {
                        var15 = class261.field3975 + class261.field3975;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3760 + class261.field3975 - class351.field5419;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3749 + class261.field3975 - class351.field5419;
                        if (var17 > class261.field3975 + class261.field3975) {
                            var17 = class261.field3975 + class261.field3975;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class322.field4852[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3750 = 5;
                            var1.field3751 = (var1.field3745 - class7.field142 << 8) / var13;
                            var1.field3754 = (var1.field3740 - class7.field142 << 8) / var13;
                            var1.field3761 = (var1.field3755 - class126.field1843 << 8) / var13;
                            var1.field3741 = (var1.field3747 - class126.field1843 << 8) / var13;
                            class193.field2814[class81.field1154++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 264)
    public static void method2200(byte arg0) {
        field4680 = null;
        if (arg0 != 127) {
            method2199();
        }
        field4684 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lqf;I)Z", line = 291)
    public static final boolean method2201(class359 arg0, int arg1) {
        field4683++;
        if (arg0.field5504 == null) {
            return false;
        } else if (arg1 == 22366) {
            for (int var2 = 0; var2 < arg0.field5504.length; var2++) {
                int var3 = class94.method735(var2, 13013, arg0);
                int var4 = arg0.field5556[var2];
                if (arg0.field5504[var2] == 2) {
                    if (var4 <= var3) {
                        return false;
                    }
                } else if (arg0.field5504[var2] == 3) {
                    if (var4 >= var3) {
                        return false;
                    }
                } else if (arg0.field5504[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
