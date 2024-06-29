import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class415 {

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "B")
    public byte field5992 = 0;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "B")
    public byte field5990;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "B")
    public byte field5984;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "S")
    public short field5988;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "S")
    public short field5975;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field5969 = -1;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "B")
    public byte field5977;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "B")
    public byte field5982;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "B")
    public byte field5983;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "B")
    public byte field5986;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Liq;")
    public class190 field5973;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "Lwaa;")
    public class33 field5976;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Lsk;")
    public class415 field5979;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Loaa;")
    public class510 field5971;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "Llaa;")
    public class578 field5978;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "Llaa;")
    public class578 field5987;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Lmg;")
    public class639 field5981;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "Lvf;")
    public class73 field5985;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "Lvf;")
    public class73 field5989;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "S")
    public short field5993;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Z")
    public boolean field5972;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Z")
    public boolean field5974;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "Z")
    public boolean field5991;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([BI)Z")
    public static final boolean method2475(byte[] arg0, int arg1) {
        field5970++;
        class428 var2 = new class428(arg0);
        int var3 = var2.method2561((byte) -99);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method2561((byte) 113) == arg1;
        if (var4) {
            class517.method3073(var2, 0);
        }
        class150.method880(var2, (byte) 0);
        return true;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
    public final void method2476(boolean arg0) {
        while (this.field5981 != null) {
            class639 var2 = this.field5981.field9291;
            this.field5981.method3699((byte) 122);
            this.field5981 = var2;
        }
        field5980++;
        if (arg0) {
            this.field5972 = true;
        }
        this.field5992 = 0;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(III)V")
    public class415(int arg0, int arg1, int arg2) {
        this.field5984 = this.field5990 = (byte) arg0;
        this.field5988 = (short) arg2;
        this.field5975 = (short) arg1;
    }

    static {
        new class487("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
    }
}
