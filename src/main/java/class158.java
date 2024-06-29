import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class158 extends class507 {

    @OriginalMember(owner = "client!vda", name = "D", descriptor = "I")
    private int field1950 = -1;

    @OriginalMember(owner = "client!vda", name = "I", descriptor = "I")
    private int field1955 = -1;

    @OriginalMember(owner = "client!vda", name = "F", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!vda", name = "J", descriptor = "I")
    public static int field1956 = 0;

    @OriginalMember(owner = "client!vda", name = "B", descriptor = "Ltf;")
    public static class248 field1948 = new class248();

    @OriginalMember(owner = "client!vda", name = "M", descriptor = "I")
    public static int field1959 = 52;

    @OriginalMember(owner = "client!vda", name = "C", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!vda", name = "E", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!vda", name = "G", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!vda", name = "H", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!vda", name = "K", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!vda", name = "L", descriptor = "Lfm;")
    public static class636 field1958;

    static {
        new class474("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V", line = 4)
    public final void method592(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field1955, this.field1950, 3553, arg0, 0);
        ++field1949;
        this.field1950 = -1;
        this.field1955 = -1;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIII)V", line = 14)
    public final void method912(int arg0, int arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg0, arg3, super.field7370, arg4);
        ++field1957;
        this.field1955 = arg2;
        this.field1950 = arg0;
        int var6 = -113 % ((arg1 - -27) / 63);
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lad;II)V", line = 57)
    public class158(class362 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field1952 = arg2;
        super.field7377.method2295(-93, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field7379, arg2, arg2, 0, class562.method3251(super.field7379, (byte) 26), 5121, (byte[]) null, 0);
        }
        this.method3020(true, 0);
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lad;IIZ[[BI)V", line = 75)
    public class158(class362 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field1952 = arg2;
        super.field7377.method2295(-109, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field7379, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method3020(true, 0);
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lad;IIZ[[I)V", line = 115)
    public class158(class362 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field1952 = arg2;
        super.field7377.method2295(-79, this);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class399.method2546(32993, 34069 - -var6, super.field7377.field5483, arg2, super.field7379, 117, arg2, arg4[var6]);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field7379, arg2, arg2, 0, 32993, super.field7377.field5483, arg4[var7], 0);
            }
        }
        this.method3020(true, 0);
    }

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "(I)V", line = 31)
    public static final void method913(int arg0) {
        for (int var1 = 0; var1 < 5; ++var1) {
            class126.field1553[var1] = false;
        }
        if (arg0 != 5) {
            field1958 = null;
        }
        ++field1954;
        class622.field8997 = 0;
        class468.field6956 = 0;
        class236.field3384 = 1;
        class61.field701 = -1;
        class74.field787 = -1;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(BZII)I", line = 94)
    public static final int method914(byte arg0, boolean arg1, int arg2, int arg3) {
        ++field1951;
        class594 var4 = class581.method3372(arg1, arg3, -125);
        if (arg0 != 107) {
            method914((byte) 78, false, -100, -71);
        }
        if (var4 == null) {
            return -1;
        } else {
            return ~arg2 <= -1 && ~var4.field8680.length < ~arg2 ? var4.field8680[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "(I)V", line = 159)
    public static void method915(int arg0) {
        if (arg0 != 5121) {
            method914((byte) 117, true, 6, 72);
        }
        field1948 = null;
        field1958 = null;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILkr;B)V", line = 170)
    public static final void method916(int arg0, class645 arg1, byte arg2) {
        class344.field4914 = 0;
        if (arg2 != 38) {
            method915(63);
        }
        class78.field861 = false;
        ++field1953;
        class286.method1855(arg1, true);
        class108.method676(arg1, false);
        if (class78.field861) {
            System.out.println("---endgpp---");
        }
        if (arg1.field2610 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field2610 + " psize:" + arg0);
        }
    }
}
