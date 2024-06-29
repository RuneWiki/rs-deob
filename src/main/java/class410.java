import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class410 {

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public int field6051 = 16;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public int field6048 = -1;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "Z")
    public boolean field6046 = false;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "Z")
    public boolean field6052 = true;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    public int field6054 = 8;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
    public int field6060 = 0;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
    public int field6062 = -1;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "I")
    public int field6057 = 127;

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "I")
    public int field6055 = -1;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
    public int field6056 = 1190717;

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
    public int field6059 = 128;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "Z")
    public boolean field6065 = true;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "Ljp;")
    public static class55 field6064 = new class55(63, -1);

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "Lnv;")
    public static class44 field6066 = new class44();

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public int field6049;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "Lla;")
    public static class310 field6067;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "Lip;")
    public class326 field6050;

    static {
        new class179("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILfh;)V", line = 5)
    public final void method2579(int arg0, class194 arg1) {
        field6058++;
        while (true) {
            int var3 = arg1.method1337((byte) -111);
            if (var3 == 0) {
                int var4 = 96 % ((arg0 + 38) / 55);
                return;
            }
            this.method2583((byte) 11, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V", line = 28)
    public final void method2580(int arg0) {
        if (arg0 != 127) {
            this.field6048 = -43;
        }
        field6063++;
        this.field6054 = this.field6049 | this.field6054 << 8;
        if (this.field6048 == -1) {
            this.field6048 = this.field6055;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILum;)V", line = 43)
    public static final void method2581(int arg0, class83 arg1) {
        field6047++;
        if (arg0 != 5489) {
            method2582((byte) -95);
        }
        class516.field7502 = arg1;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V", line = 65)
    public static void method2582(byte arg0) {
        field6066 = null;
        field6064 = null;
        int var1 = 33 / ((arg0 + 27) / 33);
        field6067 = null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BILfh;)V", line = 80)
    private final void method2583(byte arg0, int arg1, class194 arg2) {
        if (arg0 != 11) {
            return;
        }
        if (arg1 == 1) {
            this.field6060 = class62.method417(107, arg2.method1339(-32768));
        } else if (arg1 == 2) {
            this.field6055 = arg2.method1337((byte) 94);
        } else if (arg1 == 3) {
            this.field6055 = arg2.method1396(-89);
            if (this.field6055 == 65535) {
                this.field6055 = -1;
            }
        } else if (arg1 == 5) {
            this.field6052 = false;
        } else if (arg1 == 7) {
            this.field6062 = class62.method417(arg0 + 69, arg2.method1339(-32768));
        } else if (arg1 == 8) {
            this.field6050.field4935 = this.field6049;
        } else if (arg1 == 9) {
            this.field6059 = arg2.method1396(70) << 0;
        } else if (arg1 == 10) {
            this.field6065 = false;
        } else if (arg1 == 11) {
            this.field6054 = arg2.method1337((byte) -116);
        } else if (arg1 == 12) {
            this.field6046 = true;
        } else if (arg1 == 13) {
            this.field6056 = arg2.method1339(-32768);
        } else if (arg1 == 14) {
            this.field6051 = arg2.method1337((byte) 127) << 0;
        } else if (arg1 == 15) {
            this.field6048 = arg2.method1396(9);
            if (this.field6048 == 65535) {
                this.field6048 = -1;
            }
        } else if (arg1 == 16) {
            this.field6057 = arg2.method1337((byte) 18);
        }
        field6061++;
    }
}
