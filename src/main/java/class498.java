import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class498 extends class391 {

    @OriginalMember(owner = "client!ki", name = "Gb", descriptor = "Ldn;")
    public static class357 field7253 = new class357("WTQA", 2);

    @OriginalMember(owner = "client!ki", name = "Hb", descriptor = "Ldi;")
    public static class83 field7254 = new class83(41, 3);

    @OriginalMember(owner = "client!ki", name = "Ib", descriptor = "F")
    public static float field7255;

    @OriginalMember(owner = "client!ki", name = "Jb", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!ki", name = "Kb", descriptor = "F")
    public static float field7257;

    @OriginalMember(owner = "client!ki", name = "Cb", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!ki", name = "Db", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!ki", name = "Eb", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!ki", name = "Fb", descriptor = "I")
    public static int field7252;

    static {
        new class466("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field7255 = 0.0F;
        field7256 = 0;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(IB)I", line = 4)
    public static final int method2905(int arg0, byte arg1) {
        ++field7249;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = -14 / ((-74 - arg1) / 47);
        int var7 = var5 | var5 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return ~var8 & arg0;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(I)V", line = 23)
    public class498(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BF)V", line = 26)
    public final void method2906(byte arg0, float arg1) {
        ++field7252;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field5678[super.field5719++] = (byte) (var3 >> 24);
        super.field5678[super.field5719++] = (byte) (var3 >> 16);
        super.field5678[super.field5719++] = (byte) (var3 >> 8);
        super.field5678[super.field5719++] = (byte) var3;
        if (arg0 != 80) {
            field7257 = -0.5888504F;
        }
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(Z)V", line = 42)
    public static void method2907(boolean arg0) {
        if (!arg0) {
            field7255 = 0.61801225F;
        }
        field7254 = null;
        field7253 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[B)[B", line = 53)
    public static final byte[] method2908(int arg0, byte[] arg1) {
        ++field7251;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class91.method678(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IF)V", line = 68)
    public final void method2909(int arg0, float arg1) {
        ++field7250;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        if (arg0 == 1107866360) {
            super.field5678[super.field5719++] = (byte) var3;
            super.field5678[super.field5719++] = (byte) (var3 >> 8);
            super.field5678[super.field5719++] = (byte) (var3 >> 16);
            super.field5678[super.field5719++] = (byte) (var3 >> 24);
        }
    }
}
