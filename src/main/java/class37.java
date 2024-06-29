import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class37 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "Lvi;")
    private class560 field363 = new class560(128);

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "Lvi;")
    public class560 field377 = new class560(64);

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Lpq;")
    private class159 field368;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "Lpq;")
    public class159 field376;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "Lrh;")
    public static class59 field371 = new class59();

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "Ljj;")
    public static class398 field373 = new class398(38, 15);

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "[I")
    public static int[] field375 = new int[13];

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "F")
    public static float field374;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 3)
    public static void method215(int arg0) {
        if (arg0 != 36) {
            method215(-124);
        }
        field375 = null;
        field373 = null;
        field371 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V", line = 18)
    public final void method216(int arg0, int arg1) {
        class560 var3 = this.field363;
        synchronized (this.field363) {
            this.field363.method3129(arg0, 14583);
        }
        field372++;
        if (arg1 != 64) {
            this.field377 = null;
        }
        class560 var4 = this.field377;
        synchronized (this.field377) {
            this.field377.method3129(arg0, arg1 + 14519);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 36)
    public final void method217(int arg0) {
        field370++;
        class560 var2 = this.field363;
        synchronized (this.field363) {
            this.field363.method3144(true);
            int var3 = 93 / ((arg0 - 36) / 35);
        }
        class560 var4 = this.field377;
        synchronized (this.field377) {
            this.field377.method3144(true);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)Llb;", line = 51)
    public final class679 method218(int arg0, byte arg1) {
        field364++;
        class560 var3 = this.field363;
        class679 var4;
        synchronized (this.field363) {
            var4 = (class679) this.field363.method3134((long) arg0, -106);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field368;
        byte[] var6;
        synchronized (this.field368) {
            var6 = this.field368.method1087(36, arg0, 1);
        }
        class679 var7 = new class679();
        var7.field9620 = arg0;
        var7.field9652 = this;
        if (var6 != null) {
            var7.method3750(-11, new class138(var6));
        }
        if (arg1 != 13) {
            return null;
        }
        var7.method3752((byte) 107);
        class560 var8 = this.field363;
        synchronized (this.field363) {
            this.field363.method3130((long) arg0, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBI)V", line = 84)
    public final void method219(int arg0, byte arg1, int arg2) {
        this.field363 = new class560(arg0);
        if (arg1 != -127) {
            this.method221(113);
        }
        field367++;
        this.field377 = new class560(arg2);
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V", line = 102)
    public static final void method220(int arg0) {
        for (class9 var1 = (class9) class638.field8704.method374((byte) 57); var1 != null; var1 = (class9) class638.field8704.method372(-20740)) {
            if (var1.field80) {
                var1.method59((byte) -125);
            }
        }
        field366++;
        class9 var2 = (class9) class612.field8352.method374((byte) 80);
        if (arg0 > -99) {
            return;
        }
        while (var2 != null) {
            if (var2.field80) {
                var2.method59((byte) -125);
            }
            var2 = (class9) class612.field8352.method372(-20740);
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V", line = 136)
    public final void method221(int arg0) {
        class560 var2 = this.field363;
        synchronized (this.field363) {
            this.field363.method3142(false);
        }
        field369++;
        class560 var3 = this.field377;
        synchronized (this.field377) {
            this.field377.method3142(false);
            if (arg0 != 19834) {
                method215(82);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Luea;ILpq;Lpq;)V", line = 174)
    public class37(class484 arg0, int arg1, class159 arg2, class159 arg3) {
        this.field368 = arg2;
        this.field376 = arg3;
        this.field368.method1076(36, 0);
    }
}
