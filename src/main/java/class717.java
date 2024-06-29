import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class717 extends class281 {

    @OriginalMember(owner = "client!bs", name = "A", descriptor = "I")
    private int field10006;

    @OriginalMember(owner = "client!bs", name = "D", descriptor = "I")
    public static int field10009 = -1;

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "I")
    public static int field10003;

    @OriginalMember(owner = "client!bs", name = "y", descriptor = "I")
    public static int field10004;

    @OriginalMember(owner = "client!bs", name = "B", descriptor = "I")
    public static int field10007;

    @OriginalMember(owner = "client!bs", name = "C", descriptor = "I")
    public static int field10008;

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
    public static int field10010;

    @OriginalMember(owner = "client!bs", name = "G", descriptor = "I")
    public static int field10012;

    @OriginalMember(owner = "client!bs", name = "F", descriptor = "[Lap;")
    public class505[] field10011;

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "[[B")
    private byte[][] field10005;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IBI)Z")
    public static final boolean method4004(int arg0, byte arg1, int arg2) {
        field10003++;
        if (arg1 != -1) {
            method4004(69, (byte) -19, 35);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)Z")
    public final boolean method4005(int arg0, int arg1) {
        if (arg1 == -1) {
            field10008++;
            return this.field10011[arg0].field6986;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BI)Z")
    public final boolean method4006(byte arg0, int arg1) {
        field10007++;
        if (arg0 != -114) {
            field10009 = -11;
        }
        return this.field10011[arg1].field6990;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZI)Z")
    public final boolean method4007(boolean arg0, int arg1) {
        field10012++;
        if (arg0) {
            field10009 = -117;
        }
        return this.field10011[arg1].field6993;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lgea;I)Ljava/lang/String;")
    public static final String method4008(class81 arg0, int arg1) {
        if (arg1 < 3) {
            return null;
        } else {
            field10010++;
            return arg0.field1150 + " <col=ffffff>>";
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
    public class717(int arg0) {
        this.field10006 = arg0;
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(B)Z")
    public final boolean method4009(byte arg0) {
        field10004++;
        if (this.field10011 != null) {
            return true;
        }
        if (this.field10005 == null) {
            class333 var2 = class685.field9633;
            synchronized (class685.field9633) {
                if (!class685.field9633.method2087(this.field10006, 0)) {
                    return false;
                }
                int[] var4 = class685.field9633.method2108(true, this.field10006);
                this.field10005 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field10005[var5] = class685.field9633.method2095(var4[var5], this.field10006, 1);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field10005.length; var7++) {
            byte[] var8 = this.field10005[var7];
            class376 var9 = new class376(var8);
            var9.field5459 = 1;
            int var10 = var9.method2359(-1);
            class333 var11 = class394.field5810;
            synchronized (class394.field5810) {
                var6 &= class394.field5810.method2104(-125, var10);
            }
        }
        if (!var6) {
            return false;
        }
        class412 var12 = new class412();
        if (arg0 > -31) {
            return false;
        }
        class333 var13 = class685.field9633;
        int[] var15;
        synchronized (class685.field9633) {
            int var14 = class685.field9633.method2090(this.field10006, false);
            this.field10011 = new class505[var14];
            var15 = class685.field9633.method2108(true, this.field10006);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field10005[var16];
            class376 var18 = new class376(var17);
            var18.field5459 = 1;
            int var19 = var18.method2359(-1);
            class299 var20 = null;
            for (class299 var21 = (class299) var12.method2551((byte) -108); var21 != null; var21 = (class299) var12.method2542(-122)) {
                if (var21.field4326 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class333 var22 = class394.field5810;
                synchronized (class394.field5810) {
                    var20 = new class299(var19, class394.field5810.method2114(var19, false));
                }
                var12.method2545(-127, var20);
            }
            this.field10011[var15[var16]] = new class505(var17, var20);
        }
        this.field10005 = null;
        return true;
    }
}
