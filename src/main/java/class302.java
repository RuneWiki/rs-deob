import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class302 {

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "B")
    public byte field4319 = 0;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "B")
    public byte field4321;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "B")
    public byte field4303;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "S")
    public short field4323;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "S")
    public short field4315;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4300 = new String[200];

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "Lcs;")
    public static class189 field4309 = new class189(512);

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public static int field4326 = 0;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "I")
    public static int field4325 = -1;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "B")
    public byte field4305;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "B")
    public byte field4317;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "B")
    public byte field4328;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "B")
    public byte field4329;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "Lmb;")
    public class143 field4306;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "Lmb;")
    public class143 field4311;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "Lmf;")
    public class240 field4316;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "Lbg;")
    public class271 field4322;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "Lka;")
    public class276 field4310;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "Ljq;")
    public class299 field4308;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "Ldn;")
    public class302 field4327;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "Lfm;")
    public class436 field4313;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "Lfm;")
    public class436 field4324;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "S")
    public short field4314;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "Z")
    public boolean field4304;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "Z")
    public boolean field4307;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "Z")
    public boolean field4312;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 4)
    public static void method1904(int arg0) {
        field4309 = null;
        if (arg0 != -28620) {
            method1904(-79);
        }
        field4300 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V", line = 16)
    public final void method1905(boolean arg0) {
        field4318++;
        if (arg0) {
            return;
        }
        while (this.field4308 != null) {
            class299 var2 = this.field4308.field4263;
            this.field4308.method1888((byte) 82);
            this.field4308 = var2;
        }
        this.field4319 = 0;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lra;III)Lnm;", line = 35)
    public static final class277 method1906(class57 arg0, int arg1, int arg2, int arg3) {
        field4320++;
        if (arg1 != 15163) {
            method1906((class57) null, -4, -106, -9);
        }
        byte[] var4 = arg0.method361(arg3, 97, arg2);
        return var4 == null ? null : new class277(var4);
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(III)V", line = 53)
    public class302(int arg0, int arg1, int arg2) {
        this.field4303 = this.field4321 = (byte) arg0;
        this.field4323 = (short) arg2;
        this.field4315 = (short) arg1;
    }
}
