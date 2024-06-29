import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class234 extends class106 {

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field4317 = -1;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field4314 = 1;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field4301 = 0;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public int field4302;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public int field4303;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public int field4305;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public int field4306;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public int field4307;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public int field4308;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public int field4309;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public int field4310;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    public int field4313;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    public int field4315;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    public int field4316;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public int field4318;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public int field4319;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public int field4322;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    public int field4324;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public int field4327;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "Ll;")
    public class118 field4321;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Lmg;")
    public class135 field4304;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "Lmh;")
    public class136 field4326;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "Lwe;")
    public class233 field4311;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)Ldb;")
    public static final class36 method1528(byte arg0, int arg1) {
        if (arg0 > -34) {
            field4314 = 120;
        }
        class36 var2 = (class36) class53.field1064.method1318((byte) -68, (long) arg1);
        field4323++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class20.field452.method1208(arg1, (byte) 109, 16);
        class36 var4 = new class36();
        if (var3 != null) {
            var4.method269(0, new class229(var3));
        }
        class53.field1064.method1324(var4, 18373, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)V")
    public final void method1529(byte arg0) {
        this.field4321 = null;
        if (arg0 != 37) {
            this.field4321 = null;
        }
        this.field4304 = null;
        this.field4326 = null;
        this.field4311 = null;
        field4312++;
    }
}
