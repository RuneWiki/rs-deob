import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class48 {

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "Lmq;")
    private class104 field777 = new class104(64);

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "Lmq;")
    public class104 field781 = new class104(64);

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "Lfc;")
    private class343 field773;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "Lfc;")
    public class343 field775;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "Ltm;")
    public static class112 field779 = new class112("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "[I")
    public static int[] field782 = new int[32];

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field784;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "[[I")
    public static int[][] field785;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "[B")
    public static byte[] field769;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field782[var1] = var0 - 1;
            var0 += var0;
        }
        field783 = 0;
        field784 = new String[100];
        field785 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 3)
    public final void method372(int arg0) {
        field772++;
        class104 var2 = this.field777;
        synchronized (this.field777) {
            this.field777.method654(false);
        }
        if (arg0 != 6) {
            method379((byte) 49);
        }
        class104 var3 = this.field781;
        synchronized (this.field781) {
            this.field781.method654(false);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILdh;)V", line = 20)
    public static final void method373(int arg0, class269 arg1) {
        class317.field4306[arg0] = arg1;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIII)V", line = 24)
    public static final void method374(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= arg1) {
            for (int var5 = arg1; var5 < arg3; var5++) {
                class2.field16[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg3; var6 < arg1; var6++) {
                class2.field16[var6][arg0] = arg2;
            }
        }
        field776++;
        if (arg4 <= 21) {
            method379((byte) -123);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)V", line = 63)
    public final void method375(byte arg0, int arg1) {
        field780++;
        class104 var3 = this.field777;
        synchronized (this.field777) {
            this.field777.method666(arg1, false);
            if (arg0 > -16) {
                this.field773 = null;
            }
        }
        class104 var4 = this.field781;
        synchronized (this.field781) {
            this.field781.method666(arg1, false);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)B", line = 79)
    public static final byte method376(int arg0, int arg1, int arg2) {
        if (arg1 != 2597) {
            return -60;
        }
        field778++;
        if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(BI)Llr;", line = 102)
    public final class78 method377(byte arg0, int arg1) {
        field774++;
        class104 var3 = this.field777;
        class78 var4;
        synchronized (this.field777) {
            var4 = (class78) this.field777.method659((long) arg1, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field773.method2029(34, arg1, 0);
        int var6 = -12 % ((-arg0 - 43) / 50);
        class78 var7 = new class78();
        var7.field1171 = this;
        if (var5 != null) {
            var7.method539(-114, new class425(var5));
        }
        class104 var8 = this.field777;
        synchronized (this.field777) {
            this.field777.method653(121, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(III)V", line = 131)
    public final void method378(int arg0, int arg1, int arg2) {
        this.field777 = new class104(arg1);
        field771++;
        if (arg0 != -22928) {
            method373(-48, (class269) null);
        }
        this.field781 = new class104(arg2);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V", line = 145)
    public static void method379(byte arg0) {
        field784 = null;
        field769 = null;
        field785 = null;
        if (arg0 != -65) {
            method373(5, (class269) null);
        }
        field779 = null;
        field782 = null;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Ldk;ILfc;Lfc;)V", line = 223)
    public class48(class328 arg0, int arg1, class343 arg2, class343 arg3) {
        this.field773 = arg2;
        this.field775 = arg3;
        this.field773.method2054(0, 34);
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V", line = 167)
    public final void method380(int arg0) {
        field770++;
        class104 var2 = this.field777;
        synchronized (this.field777) {
            this.field777.method656(118);
            if (arg0 < 34) {
                this.field773 = null;
            }
        }
        class104 var3 = this.field781;
        synchronized (this.field781) {
            this.field781.method656(122);
        }
    }
}
