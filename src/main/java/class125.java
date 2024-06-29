import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class125 {

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Z")
    public static boolean field1617;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Lgs;")
    public static class33 field1616;

    static {
        new class194("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field1617 = false;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 8)
    public static void method702(int arg0) {
        if (arg0 != 1) {
            field1617 = false;
        }
        field1616 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "()V", line = 21)
    public static final void method704() {
        class172.field2349 = 0;
        label212: for (int var0 = 0; var0 < class55.field847; var0++) {
            class497 var1 = class456.field6642[var0];
            if (class347.field5004 != null) {
                for (int var2 = 0; var2 < class347.field5004.length; var2++) {
                    if (class347.field5004[var2] != -1000000 && (var1.field7557 <= class347.field5004[var2] || var1.field7564 <= class347.field5004[var2]) && (var1.field7559 <= class7.field123[var2] || var1.field7574 <= class7.field123[var2]) && (var1.field7559 >= class96.field1292[var2] || var1.field7574 >= class96.field1292[var2]) && (var1.field7558 <= class76.field1073[var2] || var1.field7576 <= class76.field1073[var2]) && (var1.field7558 >= class416.field6161[var2] || var1.field7576 >= class416.field6161[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field7566 == 1) {
                int var3 = var1.field7561 + class210.field2977 - class463.field6724;
                if (var3 >= 0 && var3 <= class210.field2977 + class210.field2977) {
                    int var4 = var1.field7556 + class210.field2977 - class284.field4053;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class210.field2977 + class210.field2977) {
                        continue;
                    }
                    int var5 = var1.field7568 + class210.field2977 - class284.field4053;
                    if (var5 > class210.field2977 + class210.field2977) {
                        var5 = class210.field2977 + class210.field2977;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class52.field777[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class67.field1003 - var1.field7559;
                        if (var7 > class156.field2043) {
                            var1.field7570 = 1;
                        } else {
                            if (var7 >= -class156.field2043) {
                                continue;
                            }
                            var1.field7570 = 2;
                            var7 = -var7;
                        }
                        var1.field7563 = (var1.field7558 - class95.field1278 << 8) / var7;
                        var1.field7575 = (var1.field7576 - class95.field1278 << 8) / var7;
                        var1.field7573 = (var1.field7557 - class294.field4257 << 8) / var7;
                        var1.field7562 = (var1.field7564 - class294.field4257 << 8) / var7;
                        class325.field4750[class172.field2349++] = var1;
                    }
                }
            } else if (var1.field7566 == 2) {
                int var8 = var1.field7556 + class210.field2977 - class284.field4053;
                if (var8 >= 0 && var8 <= class210.field2977 + class210.field2977) {
                    int var9 = var1.field7561 + class210.field2977 - class463.field6724;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class210.field2977 + class210.field2977) {
                        continue;
                    }
                    int var10 = var1.field7578 + class210.field2977 - class463.field6724;
                    if (var10 > class210.field2977 + class210.field2977) {
                        var10 = class210.field2977 + class210.field2977;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class52.field777[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class95.field1278 - var1.field7558;
                        if (var12 > class156.field2043) {
                            var1.field7570 = 3;
                        } else {
                            if (var12 >= -class156.field2043) {
                                continue;
                            }
                            var1.field7570 = 4;
                            var12 = -var12;
                        }
                        var1.field7571 = (var1.field7559 - class67.field1003 << 8) / var12;
                        var1.field7565 = (var1.field7574 - class67.field1003 << 8) / var12;
                        var1.field7573 = (var1.field7557 - class294.field4257 << 8) / var12;
                        var1.field7562 = (var1.field7564 - class294.field4257 << 8) / var12;
                        class325.field4750[class172.field2349++] = var1;
                    }
                }
            } else if (var1.field7566 == 4) {
                int var13 = var1.field7557 - class294.field4257;
                if (var13 > class407.field5971) {
                    int var14 = var1.field7556 + class210.field2977 - class284.field4053;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class210.field2977 + class210.field2977) {
                        continue;
                    }
                    int var15 = var1.field7568 + class210.field2977 - class284.field4053;
                    if (var15 > class210.field2977 + class210.field2977) {
                        var15 = class210.field2977 + class210.field2977;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field7561 + class210.field2977 - class463.field6724;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class210.field2977 + class210.field2977) {
                        continue;
                    }
                    int var17 = var1.field7578 + class210.field2977 - class463.field6724;
                    if (var17 > class210.field2977 + class210.field2977) {
                        var17 = class210.field2977 + class210.field2977;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class52.field777[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field7570 = 5;
                        var1.field7571 = (var1.field7559 - class67.field1003 << 8) / var13;
                        var1.field7565 = (var1.field7574 - class67.field1003 << 8) / var13;
                        var1.field7563 = (var1.field7558 - class95.field1278 << 8) / var13;
                        var1.field7575 = (var1.field7576 - class95.field1278 << 8) / var13;
                        class325.field4750[class172.field2349++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lps;Lqn;Ljava/awt/Canvas;III)Leq;", line = 278)
    public static final class134 method705(class59 arg0, class44 arg1, Canvas arg2, int arg3, int arg4, int arg5) {
        field1615++;
        if (arg3 != 7159) {
            method705(null, null, null, 82, -15, 123);
        }
        return new class487(arg5, arg2, arg0, arg4, arg1);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lor;I)Lor;")
    public abstract class435 method703(class435 arg0, int arg1);
}
