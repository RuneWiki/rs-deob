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

@OriginalClass("client!qj")
public class class245 extends class270 {

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    private int field4167 = -1;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "S")
    public static short field4164 = 1;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "Lmh;")
    public static class62 field4165 = class201.method1405(true, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!qj", name = "eb", descriptor = "Lmh;")
    private static class62 field4176 = class201.method1405(true, "skill)2");

    @OriginalMember(owner = "client!qj", name = "cb", descriptor = "Lmh;")
    public static class62 field4174 = field4176;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
    public int field4166;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "I")
    public int field4170;

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!qj", name = "bb", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!qj", name = "fb", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!qj", name = "gb", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!qj", name = "hb", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "Lwj;")
    public static class135 field4169;

    @OriginalMember(owner = "client!qj", name = "db", descriptor = "[I")
    public int[] field4175;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "(B)Z", line = 6)
    public final boolean method1713(byte arg0) {
        if (arg0 != 61) {
            return true;
        }
        field4168++;
        if (this.field4175 != null) {
            return true;
        } else if (this.field4167 >= 0) {
            class82 var2 = class41.method279(class87.field1394, this.field4167, -32768);
            var2.method627();
            this.field4166 = var2.field2207;
            this.field4175 = var2.field1363;
            this.field4170 = var2.field2202;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lmi;II)V", line = 42)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field4173++;
        int var4 = 72 / ((arg2 + 8) / 53);
        if (arg1 == 0) {
            this.field4167 = arg0.method721(126);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)I", line = 55)
    public final int method1714(int arg0) {
        if (arg0 < 108) {
            return 85;
        } else {
            field4172++;
            return this.field4167;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 72)
    public class245() {
        super(0, false);
    }

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "(B)V", line = 83)
    public static void method1715(byte arg0) {
        field4165 = null;
        field4169 = null;
        field4176 = null;
        if (arg0 >= -85) {
            field4169 = (class135) null;
        }
        field4174 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjd;I)V", line = 99)
    public static final void method1716(int arg0, class241 arg1, int arg2) {
        field4179++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            class16 var3 = (class16) class15.field130.method334(arg0 - 18673);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field139; var5++) {
                if (var3.field145[var5] != null) {
                    if (var3.field145[var5].field2322 == 2) {
                        var3.field140[var5] = -5;
                    }
                    if (var3.field145[var5].field2322 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field147[var5] != null) {
                    if (var3.field147[var5].field2322 == 2) {
                        var3.field140[var5] = -6;
                    }
                    if (var3.field147[var5].field2322 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1693(arg2, false);
            arg1.method717(1, 0);
            int var6 = arg1.field1476;
            arg1.method712(var3.field137, 116);
            for (int var7 = 0; var7 < var3.field139; var7++) {
                if (var3.field140[var7] == 0) {
                    try {
                        int var8 = var3.field149[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field145[var7].field2323;
                            int var13 = var12.getInt((Object) null);
                            arg1.method717(1, 0);
                            arg1.method712(var13, arg0 + 112);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field145[var7].field2323;
                            var11.setInt((Object) null, var3.field138[var7]);
                            arg1.method717(arg0 + 1, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field145[var7].field2323;
                            int var10 = var9.getModifiers();
                            arg1.method717(1, 0);
                            arg1.method712(var10, -58);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field147[var7].field2323;
                            byte[][] var17 = var3.field142[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method717(1, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method717(1, 1);
                                arg1.method694(((Number) var21).longValue(), (byte) -34);
                            } else if (var21 instanceof class62) {
                                arg1.method717(1, 2);
                                arg1.method710((class62) var21, false);
                            } else {
                                arg1.method717(1, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field147[var7].field2323;
                            int var15 = var14.getModifiers();
                            arg1.method717(arg0 ^ 0x1, 0);
                            arg1.method712(var15, -28);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg1.method717(arg0 + 1, -10);
                    } catch (InvalidClassException var35) {
                        arg1.method717(1, -11);
                    } catch (StreamCorruptedException var36) {
                        arg1.method717(1, -12);
                    } catch (OptionalDataException var37) {
                        arg1.method717(arg0 ^ 0x1, -13);
                    } catch (IllegalAccessException var38) {
                        arg1.method717(1, -14);
                    } catch (IllegalArgumentException var39) {
                        arg1.method717(1, -15);
                    } catch (InvocationTargetException var40) {
                        arg1.method717(arg0 ^ 0x1, -16);
                    } catch (SecurityException var41) {
                        arg1.method717(1, -17);
                    } catch (IOException var42) {
                        arg1.method717(1, -18);
                    } catch (NullPointerException var43) {
                        arg1.method717(arg0 + 1, -19);
                    } catch (Exception var44) {
                        arg1.method717(arg0 + 1, -20);
                    } catch (Throwable var45) {
                        arg1.method717(1, -21);
                    }
                } else {
                    arg1.method717(1, var3.field140[var7]);
                }
            }
            arg1.method723(var6, (byte) 89);
            arg1.method695(arg1.field1476 - var6, true);
            var3.method1444((byte) 89);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZI)[[I", line = 291)
    public int[][] method11(boolean arg0, int arg1) {
        field4178++;
        if (arg0) {
            this.field4170 = -93;
        }
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (this.field4589.field1320 && this.method1713((byte) 61)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int var6 = (class266.field4496 == this.field4170 ? arg1 : this.field4170 * arg1 / class266.field4496) * this.field4166;
            int[] var7 = var3[1];
            if (class109.field1770 == this.field4166) {
                for (int var11 = 0; var11 < class109.field1770; var11++) {
                    int var12 = this.field4175[var6++];
                    var5[var11] = class234.method1648(var12 << 4, 4080);
                    var7[var11] = class234.method1648(var12 >> 4, 4080);
                    var4[var11] = class234.method1648(4080, var12 >> 12);
                }
            } else {
                for (int var8 = 0; var8 < class109.field1770; var8++) {
                    int var9 = this.field4166 * var8 / class109.field1770;
                    int var10 = this.field4175[var6 + var9];
                    var5[var8] = class234.method1648(var10, 255) << 4;
                    var7[var8] = class234.method1648(4080, var10 >> 4);
                    var4[var8] = class234.method1648(var10 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(B)V", line = 360)
    public final void method1276(byte arg0) {
        if (arg0 >= -34) {
            this.method1713((byte) -107);
        }
        super.method1276((byte) -59);
        field4171++;
        this.field4175 = null;
    }
}
