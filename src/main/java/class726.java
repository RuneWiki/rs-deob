import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class726 extends Canvas {

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field10104;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "[Lmfa;")
    public static class217[] field10110 = new class217[8];

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field10102;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field10103;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field10105;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field10106;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field10107;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field10111;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lvr;")
    public static class458 field10109;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 8)
    public static final void method4023(byte arg0) {
        field10103++;
        if (class518.field7119 < 102) {
            class518.field7119 += 6;
        }
        if (class640.field9012 != -1 && class337.method2062(false) > class317.field4536) {
            for (int var1 = class640.field9012; var1 < class29.field311.length; var1++) {
                if (class29.field311[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class29.field311[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class30.method251(false, "Pausing for " + var2 + " seconds...");
                    class640.field9012 = var1 + 1;
                    class317.field4536 = class337.method2062(false) + ((long) (var2 * 1000));
                    return;
                }
                class57.field883 = class29.field311[var1];
                class792.method4326(false, (byte) -69);
            }
            class640.field9012 = -1;
        }
        if (class179.field2745 != 0) {
            class719.field10037 -= class179.field2745 * 5;
            if (class719.field10037 >= class442.field6126) {
                class719.field10037 = class442.field6126 - 1;
            }
            class179.field2745 = 0;
            if (class719.field10037 < 0) {
                class719.field10037 = 0;
            }
        }
        if (arg0 <= 17) {
            field10110 = null;
        }
        for (int var3 = 0; var3 < class125.field2147; var3++) {
            class618 var4 = class321.field4560[var3];
            int var5 = var4.method765(-72);
            char var6 = var4.method764((byte) -118);
            int var7 = var4.method762((byte) -82);
            if (var5 == 84) {
                class792.method4326(false, (byte) -69);
            }
            if (var5 == 80) {
                class792.method4326(true, (byte) -69);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class338.field4798 != null) {
                    String var8 = "";
                    for (int var9 = class334.field4738.length - 1; var9 >= 0; var9--) {
                        if (class334.field4738[var9] != null && class334.field4738[var9].length() > 0) {
                            var8 = var8 + class334.field4738[var9] + '\n';
                        }
                    }
                    class338.field4798.setContents(new StringSelection(var8), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class338.field4798 != null) {
                    Transferable var10 = class338.field4798.getContents(null);
                    if (var10 != null) {
                        try {
                            String var11 = (String) var10.getTransferData(DataFlavor.stringFlavor);
                            if (var11 != null) {
                                String[] var12 = class544.method3151((byte) -73, '\n', var11);
                                class779.method4281(28924, var12);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class467.field6372 > 0) {
                class57.field883 = class57.field883.substring(0, class467.field6372 - 1) + class57.field883.substring(class467.field6372);
                class467.field6372--;
            } else if (var5 == 101 && class467.field6372 < class57.field883.length()) {
                class57.field883 = class57.field883.substring(0, class467.field6372) + class57.field883.substring(class467.field6372 + 1);
            } else if (var5 == 96 && class467.field6372 > 0) {
                class467.field6372--;
            } else if (var5 == 97 && class467.field6372 < class57.field883.length()) {
                class467.field6372++;
            } else if (var5 == 102) {
                class467.field6372 = 0;
            } else if (var5 == 103) {
                class467.field6372 = class57.field883.length();
            } else if (var5 == 104 && class184.field2797 < class334.field4738.length) {
                class184.field2797++;
                class29.method242((byte) -40);
                class467.field6372 = class57.field883.length();
            } else if (var5 == 105 && class184.field2797 > 0) {
                class184.field2797--;
                class29.method242((byte) -40);
                class467.field6372 = class57.field883.length();
            } else if (class355.method2143((byte) -105, var6) || var6 == '\\' || var6 == '/' || var6 == '.' || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class57.field883 = class57.field883.substring(0, class467.field6372) + class321.field4560[var3].method764((byte) -96) + class57.field883.substring(class467.field6372);
                class467.field6372++;
            }
        }
        class125.field2147 = 0;
        class79.field1174 = 0;
        class31.method262((byte) -116);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V", line = 200)
    public static void method4024(byte arg0) {
        field10110 = null;
        if (arg0 == 45) {
            field10109 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V", line = 211)
    public static final void method4025(boolean arg0) {
        class286.field4207 = -1;
        class136.field2268 = null;
        if (!arg0) {
            field10105++;
        }
    }

    @OriginalMember(owner = "client!hf", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 223)
    public final void update(Graphics arg0) {
        this.field10104.update(arg0);
        field10102++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIB)Z", line = 231)
    public static final boolean method4026(int arg0, int arg1, byte arg2) {
        field10106++;
        int var3 = 42 % ((2 - arg2) / 44);
        return (arg1 & 0x800) != 0 | class766.method4233(arg0, (byte) -86, arg1) || class484.method2854(arg0, -83, arg1);
    }

    @OriginalMember(owner = "client!hf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 248)
    public final void paint(Graphics arg0) {
        this.field10104.paint(arg0);
        field10108++;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 260)
    public class726(Component arg0) {
        this.field10104 = arg0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 268)
    public static final void method4027(int arg0) {
        field10111++;
        int var1 = class337.field4787 * 512 + 256;
        int var2 = class427.field5930 * 512 + 256;
        int var3 = class577.method3399(var2, var1, -8724, class403.field5560) - class98.field1420;
        if (class180.field2752 >= 100) {
            class286.field4204 = class427.field5930 * 512 + 256;
            class733.field10199 = class337.field4787 * 512 + 256;
            class243.field3482 = class577.method3399(class286.field4204, class733.field10199, -8724, class403.field5560) - class98.field1420;
        } else {
            if (var1 > class733.field10199) {
                class733.field10199 += class20.field197 + ((var1 - class733.field10199) * class180.field2752 / 1000);
                if (var1 < class733.field10199) {
                    class733.field10199 = var1;
                }
            }
            if (var3 > class243.field3482) {
                class243.field3482 += (var3 - class243.field3482) * class180.field2752 / 1000 + class20.field197;
                if (class243.field3482 > var3) {
                    class243.field3482 = var3;
                }
            }
            if (var1 < class733.field10199) {
                class733.field10199 -= (class733.field10199 - var1) * class180.field2752 / 1000 + class20.field197;
                if (class733.field10199 < var1) {
                    class733.field10199 = var1;
                }
            }
            if (var2 > class286.field4204) {
                class286.field4204 += (var2 - class286.field4204) * class180.field2752 / 1000 + class20.field197;
                if (var2 < class286.field4204) {
                    class286.field4204 = var2;
                }
            }
            if (class243.field3482 > var3) {
                class243.field3482 -= class20.field197 + ((class243.field3482 - var3) * class180.field2752 / 1000);
                if (class243.field3482 < var3) {
                    class243.field3482 = var3;
                }
            }
            if (class286.field4204 > var2) {
                class286.field4204 -= (class286.field4204 - var2) * class180.field2752 / 1000 + class20.field197;
                if (var2 > class286.field4204) {
                    class286.field4204 = var2;
                }
            }
        }
        int var4 = class355.field5022 * 512 + 256;
        int var5 = class410.field5616 * 512 + 256;
        int var6 = class577.method3399(var5, var4, arg0 - 25108, class403.field5560) - class142.field2317;
        if (arg0 != 16384) {
            field10110 = null;
        }
        int var7 = var4 - class733.field10199;
        int var8 = var6 - class243.field3482;
        int var9 = var5 - class286.field4204;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class99.field1437) {
            class99.field1437 += (var11 - class99.field1437 >> 3) * class235.field3407 / 1000 + class313.field4422 << 3;
            if (class99.field1437 > var11) {
                class99.field1437 = var11;
            }
        }
        if (class99.field1437 > var11) {
            class99.field1437 -= (class99.field1437 - var11 >> 3) * class235.field3407 / 1000 + class313.field4422 << 3;
            if (var11 > class99.field1437) {
                class99.field1437 = var11;
            }
        }
        int var13 = var12 - class642.field9037;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class642.field9037 += class235.field3407 * var14 / 1000 + class313.field4422 << 3;
            class642.field9037 &= 0x3FFF;
        }
        if (var14 < 0) {
            class642.field9037 -= -var14 * class235.field3407 / 1000 + class313.field4422 << 3;
            class642.field9037 &= 0x3FFF;
        }
        int var15 = var12 - class642.field9037;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class389.field5439 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class642.field9037 = var12;
        }
    }
}
