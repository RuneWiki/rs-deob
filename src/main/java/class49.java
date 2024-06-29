import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class49 {

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "Z")
    public boolean field693 = false;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "Lpa;")
    private class387 field702 = new class387(64);

    @OriginalMember(owner = "client!gs", name = "s", descriptor = "Lpa;")
    public class387 field708 = new class387(500);

    @OriginalMember(owner = "client!gs", name = "t", descriptor = "Lpa;")
    public class387 field709 = new class387(30);

    @OriginalMember(owner = "client!gs", name = "u", descriptor = "Lpa;")
    public class387 field710 = new class387(50);

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "Z")
    public boolean field705;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "Lcb;")
    private class544 field699;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "Lcb;")
    public class544 field692;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "Lrv;")
    public static class120 field700 = new class120(1350);

    @OriginalMember(owner = "client!gs", name = "r", descriptor = "Lpa;")
    public static class387 field707 = new class387(4);

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "F")
    public static float field703;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!gs", name = "q", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!gs", name = "v", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)Ldja;", line = 3)
    public final class322 method319(int arg0, int arg1) {
        field696++;
        int var3 = -37 / ((-arg0 - 81) / 41);
        class387 var4 = this.field702;
        class322 var5;
        synchronized (this.field702) {
            var5 = (class322) this.field702.method2373((long) arg1, 103);
        }
        if (var5 != null) {
            return var5;
        }
        class544 var6 = this.field699;
        byte[] var7;
        synchronized (this.field699) {
            var7 = this.field699.method3150(class184.method1370(arg1, true), 87, class155.method1221(arg1, (byte) 72));
        }
        class322 var8 = new class322();
        var8.field4754 = this;
        var8.field4759 = arg1;
        if (var7 != null) {
            var8.method2090(68, new class120(var7));
        }
        var8.method2085((byte) -111);
        if (!this.field705 && var8.field4751) {
            var8.field4820 = null;
            var8.field4762 = null;
        }
        if (var8.field4749) {
            var8.field4757 = 0;
            var8.field4777 = false;
        }
        class387 var9 = this.field702;
        synchronized (this.field702) {
            this.field702.method2362(var8, 0, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V", line = 52)
    public final void method320(int arg0, int arg1) {
        field697++;
        this.field711 = arg1;
        class387 var3 = this.field708;
        synchronized (this.field708) {
            this.field708.method2364(1);
        }
        class387 var4 = this.field709;
        synchronized (this.field709) {
            this.field709.method2364(1);
        }
        class387 var5 = this.field710;
        synchronized (this.field710) {
            this.field710.method2364(arg0 ^ 0x547);
        }
        if (arg0 != 1350) {
            method328((byte) -21, -85);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BZ)V", line = 73)
    public final void method321(byte arg0, boolean arg1) {
        if (arg0 != 84) {
            return;
        }
        field698++;
        if (this.field693 != arg1) {
            this.field693 = arg1;
            this.method323(false);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IZ)V", line = 88)
    public final void method322(int arg0, boolean arg1) {
        field694++;
        if (this.field705 == arg1) {
            return;
        }
        this.field705 = arg1;
        this.method323(false);
        if (arg0 != -58) {
            field707 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V", line = 110)
    public final void method323(boolean arg0) {
        class387 var2 = this.field702;
        synchronized (this.field702) {
            this.field702.method2364(1);
        }
        field701++;
        class387 var3 = this.field708;
        synchronized (this.field708) {
            this.field708.method2364(1);
        }
        class387 var4 = this.field709;
        synchronized (this.field709) {
            this.field709.method2364(1);
        }
        if (arg0) {
            method325(-69);
        }
        class387 var5 = this.field710;
        synchronized (this.field710) {
            this.field710.method2364(1);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V", line = 134)
    public static void method324(int arg0) {
        field700 = null;
        if (arg0 > -78) {
            field703 = -0.42479983F;
        }
        field707 = null;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V", line = 146)
    public static final void method325(int arg0) {
        for (class542 var1 = (class542) class622.field8773.method382(0); var1 != null; var1 = (class542) class622.field8773.method391(37)) {
            class770.method4236(var1.field7594, 1);
        }
        field691++;
        if (arg0 != -3959) {
            field707 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(II)V", line = 163)
    public final void method326(int arg0, int arg1) {
        field690++;
        if (arg1 != 4) {
            field707 = null;
        }
        this.field702 = new class387(arg0);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V", line = 184)
    public final void method327(byte arg0) {
        class387 var2 = this.field702;
        synchronized (this.field702) {
            this.field702.method2369(-1);
        }
        field695++;
        class387 var3 = this.field708;
        synchronized (this.field708) {
            this.field708.method2369(-1);
        }
        if (arg0 > -80) {
            this.method327((byte) -2);
        }
        class387 var4 = this.field709;
        synchronized (this.field709) {
            this.field709.method2369(-1);
        }
        class387 var5 = this.field710;
        synchronized (this.field710) {
            this.field710.method2369(-1);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)Z", line = 206)
    public static final boolean method328(byte arg0, int arg1) {
        field706++;
        if (arg0 >= -7) {
            field700 = null;
        }
        return arg1 == 12 || arg1 == 25 || arg1 == 23 || arg1 == 3 || arg1 == 45 || arg1 == 13 || arg1 == 57;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IB)V", line = 217)
    public final void method329(int arg0, byte arg1) {
        field704++;
        int var3 = 32 / ((arg1 + 80) / 34);
        class387 var4 = this.field702;
        synchronized (this.field702) {
            this.field702.method2366(arg0, 121);
        }
        class387 var5 = this.field708;
        synchronized (this.field708) {
            this.field708.method2366(arg0, 123);
        }
        class387 var6 = this.field709;
        synchronized (this.field709) {
            this.field709.method2366(arg0, 117);
        }
        class387 var7 = this.field710;
        synchronized (this.field710) {
            this.field710.method2366(arg0, 115);
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Liv;IZLcb;Lcb;)V", line = 263)
    public class49(class106 arg0, int arg1, boolean arg2, class544 arg3, class544 arg4) {
        this.field705 = arg2;
        this.field699 = arg3;
        this.field692 = arg4;
        if (this.field699 != null) {
            int var6 = this.field699.method3136(false) - 1;
            this.field699.method3147(var6, -102);
        }
    }
}
