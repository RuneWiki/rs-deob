import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class82 extends class382 {

    @OriginalMember(owner = "client!gea", name = "r", descriptor = "I")
    public int field1447 = -1;

    @OriginalMember(owner = "client!gea", name = "z", descriptor = "I")
    public int field1455 = -1;

    @OriginalMember(owner = "client!gea", name = "y", descriptor = "Liu;")
    public static class517 field1454 = new class517(76, -1);

    @OriginalMember(owner = "client!gea", name = "F", descriptor = "Lbv;")
    public static class567 field1461 = new class567("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!gea", name = "q", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!gea", name = "s", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!gea", name = "t", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!gea", name = "u", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!gea", name = "v", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!gea", name = "w", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!gea", name = "x", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!gea", name = "A", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!gea", name = "B", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!gea", name = "C", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!gea", name = "D", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!gea", name = "E", descriptor = "I")
    public static int field1460;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gea", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field1463;

    @OriginalMember(owner = "client!gea", name = "G", descriptor = "[[[I")
    public static int[][][] field1462;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIB)Z")
    public static final boolean method752(int arg0, int arg1, byte arg2) {
        if (arg2 <= 64) {
            method752(-98, 117, (byte) -12);
        }
        ++field1452;
        return ~(arg0 & 2048) != -1;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(BLqa;II)Z")
    public final boolean method263(byte arg0, class167 arg1, int arg2, int arg3) {
        ++field1456;
        if (arg0 != 29) {
            field1462 = null;
        }
        class105 var5 = arg1.method637();
        var5.method884(super.field5680, super.field5684, super.field5678);
        class519 var6 = class611.field8684.method1621((byte) -125, this.field1451).method2311(0, -1, this.field1457, arg1, 131072, (class439) null, true, (class525) null, 0);
        if (var6 != null && var6.method1399(arg2, arg3, var5, true)) {
            return true;
        } else {
            if (this.field1447 != -1) {
                class519 var7 = class611.field8684.method1621((byte) -95, this.field1447).method2311(0, -1, this.field1449, arg1, 131072, (class439) null, true, (class525) null, 0);
                if (var7 != null && var7.method1399(arg2, arg3, var5, true)) {
                    return true;
                }
            }
            if (this.field1455 != -1) {
                class519 var8 = class611.field8684.method1621((byte) 63, this.field1455).method2311(0, -1, this.field1458, arg1, 131072, (class439) null, true, (class525) null, 0);
                if (var8 != null && var8.method1399(arg2, arg3, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IB)V")
    public static final void method753(int arg0, byte arg1) {
        ++field1446;
        if (arg1 <= -45) {
            class21 var2 = class601.method3413(arg0, 1, (byte) 109);
            var2.method227(true);
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(ILqa;)Lkm;")
    public final class120 method260(int arg0, class167 arg1) {
        ++field1448;
        if (arg0 > -50) {
            this.method260(-122, (class167) null);
        }
        return null;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lqa;B)V")
    public final void method266(class167 arg0, byte arg1) {
        if (arg1 != -40) {
            field1461 = null;
        }
        ++field1459;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Z")
    public static final boolean method754(int arg0, Class arg1, String arg2) {
        ++field1450;
        Class var3 = (Class) class601.field8522.get(arg2);
        if (var3 != null) {
            return var3.getClassLoader() == arg1.getClassLoader();
        } else {
            Object var4 = null;
            File var5 = (File) class401.field6000.get(arg2);
            if (arg0 <= 36) {
                field1454 = null;
            }
            if (var5 != null) {
                try {
                    var5 = new File(var5.getCanonicalPath());
                    Class var6 = Class.forName("java.lang.Runtime");
                    Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                    var8.invoke(var9, Boolean.TRUE);
                    var9.invoke(Runtime.getRuntime(), arg1, var5.getPath());
                    var8.invoke(var9, Boolean.FALSE);
                    class601.field8522.put(arg2, arg1);
                    return true;
                } catch (NoSuchMethodException var10) {
                    System.load(var5.getPath());
                    class601.field8522.put(arg2, field1463 != null ? field1463 : (field1463 = method756("cr")));
                    return true;
                } catch (Throwable var11) {
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(Z)V")
    public static void method755(boolean arg0) {
        field1461 = null;
        if (arg0) {
            method753(-82, (byte) 63);
        }
        field1454 = null;
        field1462 = null;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lqa;I)Lbi;")
    public final class465 method267(class167 arg0, int arg1) {
        ++field1460;
        class105 var3 = arg0.method637();
        if (arg1 != 2) {
            this.field1455 = 55;
        }
        var3.method884(super.field5680, super.field5684, super.field5678);
        class465 var4 = class603.method3437((byte) -22, 3);
        if (this.field1455 != -1) {
            class519 var5 = class611.field8684.method1621((byte) 114, this.field1455).method2311(0, -1, this.field1458, arg0, 2048, (class439) null, true, (class525) null, 0);
            if (var5 != null) {
                var5.method1379(var3, var4.field6707[2], 0);
            }
        }
        if (~this.field1447 != 0) {
            class519 var6 = class611.field8684.method1621((byte) -48, this.field1447).method2311(0, -1, this.field1449, arg0, 2048, (class439) null, true, (class525) null, 0);
            if (var6 != null) {
                var6.method1379(var3, var4.field6707[1], 0);
            }
        }
        class519 var7 = class611.field8684.method1621((byte) -51, this.field1451).method2311(0, -1, this.field1457, arg0, 2048, (class439) null, true, (class525) null, 0);
        if (var7 != null) {
            var7.method1379(var3, var4.field6707[0], 0);
        }
        return var4;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method756(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
