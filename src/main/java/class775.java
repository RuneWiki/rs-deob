import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class775 extends class673 {

    @OriginalMember(owner = "client!qda", name = "U", descriptor = "I")
    public static int field10664 = 0;

    @OriginalMember(owner = "client!qda", name = "W", descriptor = "I")
    public static int field10666 = -50;

    @OriginalMember(owner = "client!qda", name = "S", descriptor = "I")
    public static int field10662;

    @OriginalMember(owner = "client!qda", name = "X", descriptor = "I")
    public static int field10667;

    @OriginalMember(owner = "client!qda", name = "Y", descriptor = "I")
    public static int field10668;

    @OriginalMember(owner = "client!qda", name = "V", descriptor = "Ldm;")
    public static class765 field10665;

    @OriginalMember(owner = "client!qda", name = "T", descriptor = "[B")
    private byte[] field10663;

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
    public class775() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IBB)V")
    public final void method2108(int arg0, byte arg1, byte arg2) {
        field10667++;
        int var4 = arg0 * 2;
        int var5 = arg1 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field10663[var10001] = -1;
        if (arg2 != 53) {
            this.method4273(-99, -12, -19, (byte) 29);
        }
        this.field10663[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "(I)V")
    public static final void method4271(int arg0) {
        field10662++;
        class420.field5820.method3781(class420.field5820.field9496, arg0 ^ 0xB5, 1);
        if (arg0 != 255) {
            return;
        }
        class420.field5820.method3781(class420.field5820.field9495, 82, 1);
        class420.field5820.method3781(class420.field5820.field9483, 118, 2);
        class420.field5820.method3781(class420.field5820.field9460, 117, 2);
        class420.field5820.method3781(class420.field5820.field9479, arg0 ^ 0x8A, 1);
        class420.field5820.method3781(class420.field5820.field9454, 127, 1);
        class420.field5820.method3781(class420.field5820.field9468, 114, 1);
        class420.field5820.method3781(class420.field5820.field9490, arg0 ^ 0x99, 1);
        class420.field5820.method3781(class420.field5820.field9450, arg0 ^ 0x93, 1);
        class420.field5820.method3781(class420.field5820.field9487, 90, 1);
        class420.field5820.method3781(class420.field5820.field9457, 81, 1);
        class420.field5820.method3781(class420.field5820.field9481, arg0 ^ 0x8E, 1);
        class420.field5820.method3781(class420.field5820.field9489, 92, 0);
        class420.field5820.method3781(class420.field5820.field9459, 72, 1);
        class420.field5820.method3781(class420.field5820.field9485, 114, 0);
        class420.field5820.method3781(class420.field5820.field9447, 126, 0);
        class420.field5820.method3781(class420.field5820.field9453, 105, 1);
        class420.field5820.method3781(class420.field5820.field9461, arg0 - 129, 0);
        class420.field5820.method3781(class420.field5820.field9476, 105, 0);
        class343.method2105(arg0 - 251);
        class420.field5820.method3781(class420.field5820.field9493, 73, 1);
        class420.field5820.method3781(class420.field5820.field9443, 94, 3);
        class319.method1936((byte) 126);
        class166.method1239(false);
        class789.field10785 = true;
    }

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(B)V")
    public static void method4272(byte arg0) {
        if (arg0 == 30) {
            field10665 = null;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIB)[B")
    public final byte[] method4273(int arg0, int arg1, int arg2, byte arg3) {
        field10668++;
        this.field10663 = new byte[arg0 * arg1 * arg2 * 2];
        this.method4046(arg2, -4995, arg1, arg0);
        if (arg3 != 43) {
            method4272((byte) 67);
        }
        return this.field10663;
    }
}
