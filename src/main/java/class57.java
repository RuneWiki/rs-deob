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

@OriginalClass("client!p")
public class class57 {

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field935 = 0;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "Ldf;")
    public static class237 field940 = new class237();

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lhh;")
    public static class163 field944 = class137.method1065("Lade Benutzeroberfl-=che )2 ", 17);

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Lmi;")
    public static class128 field943 = new class128();

    @OriginalMember(owner = "client!p", name = "l", descriptor = "[I")
    public static int[] field945 = new int[100];

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lmd;BI)V")
    public static final void method399(class12 arg0, byte arg1, int arg2) {
        if (arg1 != -73) {
            return;
        }
        field937++;
        while (true) {
            class20 var3 = (class20) class87.field1625.method1017(41);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field316; var5++) {
                if (var3.field313[var5] != null) {
                    if (var3.field313[var5].field3566 == 2) {
                        var3.field325[var5] = -5;
                    }
                    if (var3.field313[var5].field3566 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field319[var5] != null) {
                    if (var3.field319[var5].field3566 == 2) {
                        var3.field325[var5] = -6;
                    }
                    if (var3.field319[var5].field3566 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method75(arg2, 100);
            arg0.method655(0, 0);
            int var6 = arg0.field1541;
            arg0.method604(var3.field331, 1543219568);
            for (int var7 = 0; var7 < var3.field316; var7++) {
                if (var3.field325[var7] == 0) {
                    try {
                        int var8 = var3.field311[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field313[var7].field3563;
                            int var10 = var9.getInt((Object) null);
                            arg0.method655(0, 0);
                            arg0.method604(var10, 1543219568);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field313[var7].field3563;
                            var13.setInt((Object) null, var3.field317[var7]);
                            arg0.method655(0, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field313[var7].field3563;
                            int var12 = var11.getModifiers();
                            arg0.method655(0, 0);
                            arg0.method604(var12, 1543219568);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field319[var7].field3563;
                            byte[][] var17 = var3.field310[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method655(0, 0);
                            } else if (var21 instanceof Number) {
                                arg0.method655(0, 1);
                                arg0.method651(-645765520, ((Number) var21).longValue());
                            } else if ((var21 instanceof class163)) {
                                arg0.method655(0, 2);
                                arg0.method654(17048, (class163) var21);
                            } else {
                                arg0.method655(0, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field319[var7].field3563;
                            int var15 = var14.getModifiers();
                            arg0.method655(0, 0);
                            arg0.method604(var15, 1543219568);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method655(arg1 ^ 0xFFFFFFB7, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method655(0, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method655(0, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method655(arg1 ^ 0xFFFFFFB7, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method655(0, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method655(0, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method655(0, -16);
                    } catch (SecurityException var29) {
                        arg0.method655(arg1 ^ 0xFFFFFFB7, -17);
                    } catch (IOException var30) {
                        arg0.method655(0, -18);
                    } catch (NullPointerException var31) {
                        arg0.method655(0, -19);
                    } catch (Exception var32) {
                        arg0.method655(0, -20);
                    } catch (Throwable var33) {
                        arg0.method655(0, -21);
                    }
                } else {
                    arg0.method655(0, var3.field325[var7]);
                }
            }
            arg0.method625(var6, (byte) 83);
            arg0.method659(arg0.field1541 - var6, 92);
            var3.method1063(89);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lrh;I)V")
    public static final void method400(class242 arg0, int arg1) {
        field938++;
        short var2 = 256;
        for (int var3 = 0; var3 < class94.field1782.length; var3++) {
            class94.field1782[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var17 = (int) (Math.random() * 128.0D * (double) var2);
            class94.field1782[var17] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var13 = 1; var13 < (var2 - 1); var13++) {
                for (int var15 = 1; var15 < 127; var15++) {
                    int var16 = (var13 << 7) + var15;
                    class62.field1025[var16] = (class94.field1782[var16 - 1] + class94.field1782[var16 - 128] + class94.field1782[var16 - -128] + class94.field1782[var16 + 1]) / 4;
                }
            }
            int[] var14 = class94.field1782;
            class94.field1782 = class62.field1025;
            class62.field1025 = var14;
        }
        if (arg0 != null) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.field1785; var7++) {
                for (int var8 = 0; var8 < arg0.field1784; var8++) {
                    if (arg0.field4293[var6++] != 0) {
                        int var9 = var7 + arg0.field1775 + 16;
                        int var10 = arg0.field1779 + var8 + 16;
                        int var11 = (var9 << 7) + var10;
                        class94.field1782[var11] = 0;
                    }
                }
            }
        }
        int var12 = 97 / ((arg1 - 33) / 59);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method401(byte arg0) {
        int var1 = -60 / ((arg0 - 45) / 51);
        field944 = null;
        field943 = null;
        field940 = null;
        field945 = null;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    public class57() {
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lp;)V")
    public class57(class57 arg0) {
        this.field941 = arg0.field941;
        this.field934 = arg0.field934;
        this.field936 = arg0.field936;
        this.field942 = arg0.field942;
    }
}
