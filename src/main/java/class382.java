import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class382 {

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "Z")
    public boolean field5425 = false;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Lco;")
    private class210 field5423 = new class210(64);

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "Lco;")
    public class210 field5437 = new class210(500);

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "Lco;")
    public class210 field5438 = new class210(30);

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "Lco;")
    public class210 field5439 = new class210(50);

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Lg;")
    public class470 field5420;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Z")
    public boolean field5415;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public int field5434;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Lg;")
    private class470 field5418;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field5413 = 0;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field5428 = 0;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "[I")
    public static int[] field5421 = new int[50];

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field5431 = 0;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
    public int field5440;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "[I")
    public static int[] field5430;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "[[B")
    public static byte[][] field5432;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "[[[J")
    public static long[][][] field5424;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V", line = 11)
    public final void method2288(int arg0, byte arg1) {
        class210 var3 = this.field5423;
        synchronized (this.field5423) {
            this.field5423.method1166(arg0, (byte) -52);
        }
        field5417++;
        class210 var4 = this.field5437;
        synchronized (this.field5437) {
            this.field5437.method1166(arg0, (byte) -52);
        }
        class210 var5 = this.field5438;
        synchronized (this.field5438) {
            if (arg1 > -9) {
                this.method2290(-69, -75);
            }
            this.field5438.method1166(arg0, (byte) -52);
        }
        class210 var6 = this.field5439;
        synchronized (this.field5439) {
            this.field5439.method1166(arg0, (byte) -52);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 33)
    public final void method2289(byte arg0) {
        class210 var2 = this.field5423;
        synchronized (this.field5423) {
            if (arg0 != 86) {
                return;
            }
            this.field5423.method1165((byte) 118);
        }
        field5414++;
        class210 var3 = this.field5437;
        synchronized (this.field5437) {
            this.field5437.method1165((byte) 118);
        }
        class210 var4 = this.field5438;
        synchronized (this.field5438) {
            this.field5438.method1165((byte) 118);
        }
        class210 var5 = this.field5439;
        synchronized (this.field5439) {
            this.field5439.method1165((byte) 118);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V", line = 55)
    public final void method2290(int arg0, int arg1) {
        this.field5440 = arg0;
        field5435++;
        class210 var3 = this.field5437;
        synchronized (this.field5437) {
            this.field5437.method1165((byte) 118);
            if (arg1 != 4169) {
                field5421 = null;
            }
        }
        class210 var4 = this.field5438;
        synchronized (this.field5438) {
            this.field5438.method1165((byte) 118);
        }
        class210 var5 = this.field5439;
        synchronized (this.field5439) {
            this.field5439.method1165((byte) 118);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 76)
    public static final int method2291(String arg0, boolean arg1) {
        field5426++;
        if (!arg1) {
            method2291((String) null, true);
        }
        for (int var2 = 0; var2 < class479.field6786.length; var2++) {
            if (class479.field6786[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZI)V", line = 99)
    public final void method2292(boolean arg0, int arg1) {
        field5433++;
        if (arg0) {
            this.field5420 = null;
        }
        this.field5423 = new class210(arg1);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lkd;BLjava/lang/Object;)V", line = 112)
    public static final void method2293(class355 arg0, byte arg1, Object arg2) {
        field5436++;
        if (arg0.field5094 == null || arg1 != -119) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field5094.peekEvent() != null; var3++) {
            class85.method433(1L, 119);
        }
        if (arg2 != null) {
            arg0.field5094.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZ)V", line = 140)
    public final void method2294(int arg0, boolean arg1) {
        field5419++;
        if (arg1 == this.field5425) {
            return;
        }
        if (arg0 != 0) {
            this.field5418 = null;
        }
        this.field5425 = arg1;
        this.method2289((byte) 86);
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lci;IZLg;Lg;)V", line = 290)
    public class382(class421 arg0, int arg1, boolean arg2, class470 arg3, class470 arg4) {
        this.field5420 = arg4;
        this.field5415 = arg2;
        this.field5434 = arg1;
        this.field5418 = arg3;
        if (this.field5418 != null) {
            int var6 = this.field5418.method2756(true) - 1;
            this.field5418.method2755(-87, var6);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 162)
    public static void method2295(int arg0) {
        field5424 = null;
        field5430 = null;
        field5421 = null;
        field5432 = null;
        if (arg0 != 0) {
            field5424 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BZ)V", line = 175)
    public final void method2296(byte arg0, boolean arg1) {
        field5422++;
        if (arg1 != this.field5415) {
            this.field5415 = arg1;
            int var3 = 70 % ((-arg0 - 53) / 61);
            this.method2289((byte) 86);
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)Lcu;", line = 201)
    public final class415 method2297(int arg0, int arg1) {
        field5416++;
        class210 var3 = this.field5423;
        class415 var4;
        synchronized (this.field5423) {
            var4 = (class415) this.field5423.method1163((byte) -81, (long) arg1);
        }
        if (arg0 != 50) {
            return null;
        } else if (var4 == null) {
            byte[] var5 = this.field5418.method2768(-20472, class342.method2079(19552, arg1), class459.method2700((byte) -91, arg1));
            class415 var6 = new class415();
            var6.field5918 = arg1;
            var6.field5933 = this;
            if (var5 != null) {
                var6.method2464(new class179(var5), false);
            }
            var6.method2468((byte) 120);
            if (var6.field5980) {
                var6.field5942 = false;
                var6.field5970 = 0;
            }
            if (!this.field5415 && var6.field5948) {
                var6.field5949 = null;
                var6.field5922 = null;
            }
            class210 var7 = this.field5423;
            synchronized (this.field5423) {
                this.field5423.method1172((long) arg1, 1, var6);
                return var6;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V", line = 252)
    public final void method2298(int arg0) {
        class210 var2 = this.field5423;
        synchronized (this.field5423) {
            if (arg0 > -33) {
                this.method2292(false, 72);
            }
            this.field5423.method1169(1076);
        }
        field5427++;
        class210 var3 = this.field5437;
        synchronized (this.field5437) {
            this.field5437.method1169(1076);
        }
        class210 var4 = this.field5438;
        synchronized (this.field5438) {
            this.field5438.method1169(1076);
        }
        class210 var5 = this.field5439;
        synchronized (this.field5439) {
            this.field5439.method1169(1076);
        }
    }
}
