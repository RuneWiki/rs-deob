import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class655 implements class167 {

    @OriginalMember(owner = "client!go", name = "j", descriptor = "Lfd;")
    private class554 field9032;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "Lqia;")
    private class23 field9024;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "[F")
    public static float[] field9026 = new float[16384];

    @OriginalMember(owner = "client!go", name = "g", descriptor = "[F")
    public static float[] field9029 = new float[16384];

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public static int field9030;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "Ljia;")
    public static class645 field9031;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field9029[var2] = (float) Math.sin((double) var2 * var0);
            field9026[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method685(int arg0) {
        field9025++;
        if (arg0 != -18299) {
            this.field9032 = null;
        }
        return this.field9024.method244(104);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IZ)V", line = 15)
    public final void method821(int arg0, boolean arg1) {
        field9030++;
        class458 var3 = this.field9024.method245(0, this.field9032.field7707);
        int var4 = 56 / ((arg0 - 53) / 52);
        if (var3 == null) {
            return;
        }
        int var5 = this.field9032.field7709.method860((byte) -62, class243.field2870, this.field9032.field7716) + this.field9032.field7717;
        int var6 = this.field9032.field7710.method102(this.field9032.field7715, (byte) 61, class412.field5381) + this.field9032.field7714;
        if (this.field9032.field7713) {
            class363.field4526.method633(var5, var6, this.field9032.field7716, this.field9032.field7715, this.field9032.field7706, 0);
        }
        int var7 = var6 + this.method3701(5, (byte) 117, class452.field6380, var6, var3.field6459, var5) * 12;
        int var10 = var7 + 8;
        if (this.field9032.field7713) {
            class363.field4526.method592(var5, var10, this.field9032.field7716 + var5 - 1, var10, this.field9032.field7706, 0);
        }
        var7 = var10 + 1;
        int var8 = var7 + this.method3701(5, (byte) 117, class452.field6380, var7, var3.field6456, var5) * 12;
        int var11 = var8 + 5;
        int var10000 = var11 + this.method3701(5, (byte) 117, class452.field6380, var11, var3.field6455, var5) * 12;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lbt;ILbt;I)V", line = 51)
    public static final void method3699(class48 arg0, int arg1, class48 arg2, int arg3) {
        class193.field2301 = arg2;
        if (arg3 != 15845) {
            field9031 = null;
        }
        class491.field6851 = arg0;
        field9028++;
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V", line = 66)
    public static void method3700(int arg0) {
        field9026 = null;
        field9031 = null;
        if (arg0 != 16384) {
            method3700(34);
        }
        field9029 = null;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V", line = 80)
    public final void method684(int arg0) {
        if (arg0 != 30573) {
            field9026 = null;
        }
        field9027++;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IBLda;ILjava/lang/String;I)I", line = 95)
    private final int method3701(int arg0, byte arg1, class67 arg2, int arg3, String arg4, int arg5) {
        if (arg1 != 117) {
            field9031 = null;
        }
        field9023++;
        return arg2.method668(0, this.field9032.field7704, false, 0, 0, arg3 + arg0, 0, arg4, 0, this.field9032.field7715 - arg0 * 2, null, null, this.field9032.field7716 - (arg0 * 2), null, arg0 + arg5, this.field9032.field7708);
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lqia;Lfd;)V", line = 125)
    public class655(class23 arg0, class554 arg1) {
        this.field9032 = arg1;
        this.field9024 = arg0;
    }
}
