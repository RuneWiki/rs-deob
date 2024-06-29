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

@OriginalClass("client!cn")
public class class228 {

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "J")
    public long field3482 = 0L;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3471 = "Loading wordpack - ";

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3481 = "glow3:";

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    public static int field3488 = 0;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "Lfa;")
    public static class98 field3479 = new class98(64);

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    public static int field3490 = 0;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public int field3472;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public int field3473;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public int field3476;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public int field3477;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public int field3478;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public int field3483;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public int field3484;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public int field3485;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public int field3486;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "Lfc;")
    public class110 field3480;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "Lmk;")
    public static class25 field3489;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ltk;BI)V", line = 7)
    public static final void method1614(class151 arg0, byte arg1, int arg2) {
        field3487++;
        int var3 = 26 / ((52 - arg1) / 59);
        while (true) {
            class111 var4 = (class111) class61.field815.method1954(-66);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field1681; var6++) {
                if (var4.field1669[var6] != null) {
                    if (var4.field1669[var6].field3185 == 2) {
                        var4.field1690[var6] = -5;
                    }
                    if (var4.field1669[var6].field3185 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field1686[var6] != null) {
                    if (var4.field1686[var6].field3185 == 2) {
                        var4.field1690[var6] = -6;
                    }
                    if (var4.field1686[var6].field3185 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg0.method1141((byte) 89, arg2);
            arg0.method1752(0, -87);
            int var7 = arg0.field3866;
            arg0.method1773(var4.field1688, false);
            for (int var8 = 0; var8 < var4.field1681; var8++) {
                if (var4.field1690[var8] == 0) {
                    try {
                        int var9 = var4.field1678[var8];
                        if (var9 == 0) {
                            Field var13 = (Field) var4.field1669[var8].field3186;
                            int var14 = var13.getInt((Object) null);
                            arg0.method1752(0, -116);
                            arg0.method1773(var14, false);
                        } else if (var9 == 1) {
                            Field var12 = (Field) var4.field1669[var8].field3186;
                            var12.setInt((Object) null, var4.field1674[var8]);
                            arg0.method1752(0, -97);
                        } else if (var9 == 2) {
                            Field var10 = (Field) var4.field1669[var8].field3186;
                            int var11 = var10.getModifiers();
                            arg0.method1752(0, -106);
                            arg0.method1773(var11, false);
                        }
                        if (var9 == 3) {
                            Method var17 = (Method) var4.field1686[var8].field3186;
                            byte[][] var18 = var4.field1675[var8];
                            Object[] var19 = new Object[var18.length];
                            for (int var20 = 0; var20 < var18.length; var20++) {
                                ObjectInputStream var21 = new ObjectInputStream(new ByteArrayInputStream(var18[var20]));
                                var19[var20] = var21.readObject();
                            }
                            Object var22 = var17.invoke((Object) null, var19);
                            if (var22 == null) {
                                arg0.method1752(0, -108);
                            } else if (var22 instanceof Number) {
                                arg0.method1752(1, -102);
                                arg0.method1738((byte) 97, ((Number) var22).longValue());
                            } else if ((var22 instanceof String)) {
                                arg0.method1752(2, -125);
                                arg0.method1766(0, (String) var22);
                            } else {
                                arg0.method1752(4, -101);
                            }
                        } else if (var9 == 4) {
                            Method var15 = (Method) var4.field1686[var8].field3186;
                            int var16 = var15.getModifiers();
                            arg0.method1752(0, -94);
                            arg0.method1773(var16, false);
                        }
                    } catch (ClassNotFoundException var35) {
                        arg0.method1752(-10, -91);
                    } catch (InvalidClassException var36) {
                        arg0.method1752(-11, -89);
                    } catch (StreamCorruptedException var37) {
                        arg0.method1752(-12, -98);
                    } catch (OptionalDataException var38) {
                        arg0.method1752(-13, -93);
                    } catch (IllegalAccessException var39) {
                        arg0.method1752(-14, -117);
                    } catch (IllegalArgumentException var40) {
                        arg0.method1752(-15, -114);
                    } catch (InvocationTargetException var41) {
                        arg0.method1752(-16, -120);
                    } catch (SecurityException var42) {
                        arg0.method1752(-17, -82);
                    } catch (IOException var43) {
                        arg0.method1752(-18, -116);
                    } catch (NullPointerException var44) {
                        arg0.method1752(-19, -88);
                    } catch (Exception var45) {
                        arg0.method1752(-20, -106);
                    } catch (Throwable var46) {
                        arg0.method1752(-21, -105);
                    }
                } else {
                    arg0.method1752(var4.field1690[var8], -86);
                }
            }
            arg0.method1737(-32769, var7);
            arg0.method1767(arg0.field3866 - var7, 791705512);
            var4.method39(10717);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 213)
    public static void method1615(int arg0) {
        field3471 = null;
        field3481 = null;
        if (arg0 != -429) {
            field3489 = (class25) null;
        }
        field3479 = null;
        field3489 = null;
    }
}
