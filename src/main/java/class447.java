import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class447 {

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    private int field6513 = 0;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    private int field6514 = 0;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    private int field6520 = 0;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "Ltu;")
    private class221 field6515 = null;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "Lrl;")
    private class487 field6511;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Lha;")
    private class40 field6517;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "[Lwo;")
    private class503[] field6512;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "Lmb;")
    public class164 field6524;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
    public static int[] field6506 = new int[3];

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Lwt;")
    public static class194 field6519 = new class194("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Lgn;")
    public static class475 field6522 = new class475(13, 6);

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "[Ljt;")
    public static class64[] field6525 = new class64[30];

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "[I")
    public static int[] field6523;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;)V", line = 4)
    public static final void method2609(String arg0, int arg1, String arg2, int arg3, int arg4, String arg5) {
        field6510++;
        class40.method308(arg0, -1, null, arg4, arg2, -1, arg5, arg1);
        int var6 = 99 % ((10 - arg3) / 58);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)Z", line = 14)
    public final boolean method2610(byte arg0, int arg1) {
        if (arg0 != 25) {
            this.method2613(98, 94, 50);
        }
        field6508++;
        return this.field6512[arg1].method623((byte) 93);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZZI)V", line = 25)
    public final void method2611(int arg0, boolean arg1, boolean arg2, int arg3) {
        boolean var5 = arg2 & this.field6511.method744();
        field6516++;
        if (arg0 != 0) {
            this.method2615(-73, null, (byte) -53);
        }
        if (!var5 && (arg3 == 4 || arg3 == 8)) {
            arg3 = 2;
        }
        if (arg3 != 0 && arg1) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field6520 != arg3) {
            if (this.field6520 != 0) {
                this.field6512[Integer.MAX_VALUE & this.field6520].method629((byte) -122);
            }
            if (arg3 != 0) {
                this.field6512[Integer.MAX_VALUE & arg3].method627(arg1, arg0 ^ 0xFFFFF8F3);
                this.field6512[Integer.MAX_VALUE & arg3].method625(false, arg1);
            }
            this.field6513 = Integer.MIN_VALUE;
            this.field6520 = arg3;
            this.field6514 = Integer.MIN_VALUE;
            this.field6515 = null;
        } else if (this.field6520 != 0) {
            this.field6512[this.field6520 & Integer.MAX_VALUE].method625(false, arg1);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 65)
    public static void method2612(int arg0) {
        field6519 = null;
        field6525 = null;
        field6523 = null;
        field6506 = null;
        int var1 = -73 % ((-arg0 - 91) / 35);
        field6522 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V", line = 87)
    public final void method2613(int arg0, int arg1, int arg2) {
        if (arg1 != 8) {
            return;
        }
        if ((this.field6513 != arg2 | this.field6514 != arg0) & this.field6520 != 0) {
            this.field6512[this.field6520 & Integer.MAX_VALUE].method624(59, arg0, arg2);
            this.field6514 = arg0;
            this.field6513 = arg2;
        }
        field6507++;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lrl;)V", line = 176)
    public class447(class487 arg0) {
        this.field6511 = arg0;
        this.field6517 = new class40(arg0);
        this.field6512 = new class503[10];
        this.field6512[1] = new class309(arg0);
        this.field6512[2] = new class284(arg0, this.field6517);
        this.field6512[4] = new class504(arg0, this.field6517);
        this.field6512[5] = new class411(arg0, this.field6517);
        this.field6512[6] = new class104(arg0);
        this.field6512[7] = new class124(arg0);
        this.field6512[3] = this.field6524 = new class164(arg0);
        this.field6512[8] = new class432(arg0, this.field6517);
        this.field6512[9] = new class318(arg0, this.field6517);
        if (!this.field6512[8].method623((byte) 69)) {
            this.field6512[8] = this.field6512[4];
        }
        if (!this.field6512[9].method623((byte) 112)) {
            this.field6512[9] = this.field6512[8];
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)B", line = 116)
    public static final byte method2614(int arg0, int arg1, int arg2) {
        field6521++;
        if (arg0 != 20111) {
            return -32;
        } else if (arg1 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILtu;B)Z", line = 137)
    public final boolean method2615(int arg0, class221 arg1, byte arg2) {
        if (arg2 > -74) {
            this.field6515 = null;
        }
        field6509++;
        if (this.field6520 == 0) {
            return false;
        }
        if (this.field6515 != arg1) {
            this.field6512[Integer.MAX_VALUE & this.field6520].method626(arg0, (byte) -49, arg1);
            this.field6515 = arg1;
        }
        return true;
    }
}
