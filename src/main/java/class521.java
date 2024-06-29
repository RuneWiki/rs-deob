import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class521 {

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public int field7662;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Z")
    public boolean field7667;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Z")
    public boolean field7668;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "[S")
    public short[] field7648;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public int field7651;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    private int field7657;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "[I")
    public static int[] field7661 = new int[1];

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lgk;")
    public static class331 field7655 = new class331("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Z")
    public static boolean field7663 = false;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    private int field7649;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    private int field7656;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    private int field7658;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    private int field7659;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lvp;")
    public class124 field7653;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field7650;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZI)V")
    public final void method3094(int arg0, boolean arg1, int arg2) {
        field7664++;
        if (arg2 <= 3) {
            field7655 = null;
        }
        int var4;
        if (arg1) {
            var4 = 2048;
        } else {
            int var5 = this.field7659 * arg0 / 50 + this.field7657 & 0x7FF;
            int var6 = this.field7658;
            if (var6 == 1) {
                var4 = (class340.field4724[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var4 = class4.field60[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field7653.method773(0, (float) ((this.field7649 * var4 >> 11) + this.field7656) / 2048.0F);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    private final void method3095(byte arg0) {
        field7660++;
        if (arg0 < 18) {
            this.field7648 = null;
        }
        int var2 = this.field7651;
        if (var2 == 2) {
            this.field7656 = 0;
            this.field7658 = 1;
            this.field7649 = 2048;
            this.field7659 = 2048;
        } else if (var2 == 3) {
            this.field7656 = 0;
            this.field7649 = 2048;
            this.field7659 = 4096;
            this.field7658 = 1;
        } else if (var2 == 4) {
            this.field7658 = 4;
            this.field7659 = 2048;
            this.field7656 = 0;
            this.field7649 = 2048;
        } else if (var2 == 5) {
            this.field7659 = 8192;
            this.field7649 = 2048;
            this.field7658 = 4;
            this.field7656 = 0;
        } else if (var2 == 12) {
            this.field7656 = 0;
            this.field7659 = 2048;
            this.field7649 = 2048;
            this.field7658 = 2;
        } else if (var2 == 13) {
            this.field7649 = 2048;
            this.field7656 = 0;
            this.field7658 = 2;
            this.field7659 = 8192;
        } else if (var2 == 10) {
            this.field7656 = 1536;
            this.field7649 = 512;
            this.field7659 = 2048;
            this.field7658 = 3;
        } else if (var2 == 11) {
            this.field7656 = 1536;
            this.field7659 = 4096;
            this.field7649 = 512;
            this.field7658 = 3;
        } else if (var2 == 6) {
            this.field7649 = 768;
            this.field7656 = 1280;
            this.field7659 = 2048;
            this.field7658 = 3;
        } else if (var2 == 7) {
            this.field7649 = 768;
            this.field7656 = 1280;
            this.field7659 = 4096;
            this.field7658 = 3;
        } else if (var2 == 8) {
            this.field7659 = 2048;
            this.field7649 = 1024;
            this.field7658 = 3;
            this.field7656 = 1024;
        } else if (var2 == 9) {
            this.field7649 = 1024;
            this.field7659 = 4096;
            this.field7658 = 3;
            this.field7656 = 1024;
        } else if (var2 == 14) {
            this.field7658 = 1;
            this.field7649 = 768;
            this.field7659 = 2048;
            this.field7656 = 1280;
        } else if (var2 == 15) {
            this.field7658 = 1;
            this.field7656 = 1536;
            this.field7659 = 4096;
            this.field7649 = 512;
        } else if (var2 == 16) {
            this.field7649 = 256;
            this.field7658 = 1;
            this.field7656 = 1792;
            this.field7659 = 8192;
        } else {
            this.field7659 = 2048;
            this.field7649 = 2048;
            this.field7656 = 0;
            this.field7658 = 0;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIB)V")
    public final void method3096(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field7656 = arg3;
        this.field7658 = arg0;
        field7669++;
        this.field7659 = arg1;
        this.field7649 = arg2;
        int var6 = 95 % ((arg4 - 6) / 61);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([Ljava/lang/Object;[JB)V")
    public static final void method3097(Object[] arg0, long[] arg1, byte arg2) {
        field7654++;
        if (arg2 <= 38) {
            field7655 = null;
        }
        class73.method695(0, arg1, arg0, arg1.length - 1, 28260);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILcw;I)V")
    public static final void method3098(int arg0, class120 arg1, int arg2) {
        if (arg2 > -77) {
            field7661 = null;
        }
        field7652++;
        while (true) {
            class123 var3 = (class123) class39.field449.method1018(108);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1797; var5++) {
                if (var3.field1795[var5] != null) {
                    if (var3.field1795[var5].field6617 == 2) {
                        var3.field1804[var5] = -5;
                    }
                    if (var3.field1795[var5].field6617 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1801[var5] != null) {
                    if (var3.field1801[var5].field6617 == 2) {
                        var3.field1804[var5] = -6;
                    }
                    if (var3.field1801[var5].field6617 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method942(arg0, 13127);
            arg1.method638(255, 0);
            int var6 = arg1.field827;
            arg1.method618(var3.field1800, (byte) 93);
            for (int var7 = 0; var7 < var3.field1797; var7++) {
                if (var3.field1804[var7] == 0) {
                    try {
                        int var8 = var3.field1798[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field1795[var7].field6613;
                            int var10 = var9.getInt(null);
                            arg1.method638(255, 0);
                            arg1.method618(var10, (byte) 119);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field1795[var7].field6613;
                            var11.setInt(null, var3.field1799[var7]);
                            arg1.method638(255, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field1795[var7].field6613;
                            int var13 = var12.getModifiers();
                            arg1.method638(255, 0);
                            arg1.method618(var13, (byte) -3);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field1801[var7].field6613;
                            byte[][] var15 = var3.field1794[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg1.method638(255, 0);
                            } else if (var19 instanceof Number) {
                                arg1.method638(255, 1);
                                arg1.method591(((Number) var19).longValue(), (byte) -48);
                            } else if (var19 instanceof String) {
                                arg1.method638(255, 2);
                                arg1.method605(95, (String) var19);
                            } else {
                                arg1.method638(255, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field1801[var7].field6613;
                            int var21 = var20.getModifiers();
                            arg1.method638(255, 0);
                            arg1.method618(var21, (byte) 122);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method638(255, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method638(255, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method638(255, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method638(255, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method638(255, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method638(255, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method638(255, -16);
                    } catch (SecurityException var29) {
                        arg1.method638(255, -17);
                    } catch (IOException var30) {
                        arg1.method638(255, -18);
                    } catch (NullPointerException var31) {
                        arg1.method638(255, -19);
                    } catch (Exception var32) {
                        arg1.method638(255, -20);
                    } catch (Throwable var33) {
                        arg1.method638(255, -21);
                    }
                } else {
                    arg1.method638(255, var3.field1804[var7]);
                }
            }
            arg1.method612(var6, -19774);
            arg1.method632(-1591647264, arg1.field827 - var6);
            var3.method1525((byte) -36);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
    public static void method3099(byte arg0) {
        field7655 = null;
        if (arg0 != -29) {
            method3097(null, null, (byte) 48);
        }
        field7661 = null;
        field7650 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lya;IIIIII)V")
    private final void method3100(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == -591532287) {
            field7665++;
            this.field7653 = arg0.method392(arg2, arg4, arg3, arg6, arg5, 1.0F);
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    protected class521() {
        if (class4.field60 == null) {
            class444.method2705(true);
        }
        this.method3095((byte) 79);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lya;Liv;I)V")
    public class521(class38 arg0, class65 arg1, int arg2) {
        if (class4.field60 == null) {
            class444.method2705(true);
        }
        this.field7662 = arg1.method577(255);
        this.field7667 = (this.field7662 & 0x8) != 0;
        this.field7668 = (this.field7662 & 0x10) != 0;
        this.field7662 &= 0x7;
        int var4 = arg1.method623((byte) -53) << arg2;
        int var5 = arg1.method623((byte) 114) << arg2;
        int var6 = arg1.method623((byte) 117) << arg2;
        int var7 = arg1.method577(255);
        int var8 = var7 * 2 + 1;
        this.field7648 = new short[var8];
        for (int var9 = 0; var9 < this.field7648.length; var9++) {
            short var13 = (short) arg1.method623((byte) -72);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            if (var15 > var8 - var14) {
                var15 = var8 - var14;
            }
            this.field7648[var9] = (short) class244.method1606(var15, var14 << 8);
        }
        int var10 = (var7 << class527.field7754) + class47.field517;
        int var11 = class37.field413 == null ? class121.field1717[class369.method2281(-32, arg1.method623((byte) 119)) & 0xFFFF] : class37.field413[arg1.method623((byte) -82)];
        int var12 = arg1.method577(255);
        this.field7651 = var12 & 0x1F;
        this.field7657 = var12 & 0xE0 << 3;
        if (this.field7651 != 31) {
            this.method3095((byte) 22);
        }
        this.method3100(arg0, -591532287, var4, var5, var6, var11, var10);
    }
}
