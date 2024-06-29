import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class78 {

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "[B")
    public byte[] field1199;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "[Ljava/lang/String;")
    public String[] field1203;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "[I")
    public int[] field1213;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "[S")
    public short[] field1200;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "[S")
    public short[] field1201;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1209 = "Connected to update server";

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "Lha;")
    public static class267 field1210;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "[I")
    public static int[] field1205;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I")
    public final int method514(int arg0, int arg1) {
        if (arg0 != -24866) {
            this.method515(24, -102);
        }
        field1206++;
        return this.field1199[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)Z")
    public final boolean method515(int arg0, int arg1) {
        if (arg0 != -1) {
            field1205 = null;
        }
        field1212++;
        return (this.field1199[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
    public static void method516(boolean arg0) {
        field1210 = null;
        field1205 = null;
        field1209 = null;
        if (arg0) {
            method516(true);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)Z")
    public final boolean method517(int arg0, byte arg1) {
        if (arg1 == -121) {
            field1211++;
            return (this.field1199[arg0] & 0x10) == 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(IB)Z")
    public final boolean method518(int arg0, byte arg1) {
        if (arg1 == 29) {
            field1207++;
            return (this.field1199[arg0] & 0x8) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V")
    public class78(int arg0) {
        this.field1204 = arg0;
        this.field1199 = new byte[this.field1204];
        this.field1203 = new String[this.field1204];
        this.field1213 = new int[this.field1204];
        this.field1200 = new short[this.field1204];
        this.field1201 = new short[this.field1204];
    }
}
