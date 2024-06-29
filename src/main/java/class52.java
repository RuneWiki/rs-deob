import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class52 {

    @OriginalMember(owner = "client!al", name = "o", descriptor = "Ler;")
    private class54 field647 = new class54();

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    private int field635;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    private int field648;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "Lbn;")
    private class256 field642;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Z")
    public static boolean field636 = false;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "[[I")
    public static int[][] field646 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!al", name = "i", descriptor = "[I")
    public static int[] field641 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!al", name = "u", descriptor = "Ljava/lang/String;")
    public static String field653 = "K";

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field650 = 0;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "Ljava/lang/String;")
    public static String field654 = "wave2:";

    @OriginalMember(owner = "client!al", name = "s", descriptor = "Z")
    public static boolean field651 = false;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "[I")
    public static int[] field640;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
    public static void method330(byte arg0) {
        field646 = null;
        if (arg0 < 57) {
            field646 = null;
        }
        field653 = null;
        field641 = null;
        field640 = null;
        field654 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method331(byte arg0, long arg1) {
        field644++;
        class328 var4 = (class328) this.field642.method1770(-880, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1255(7756);
        if (var5 == null) {
            var4.method1120(arg0 + 13);
            var4.method90((byte) -53);
            this.field635++;
            return null;
        }
        if (var4.method1256(arg0 ^ 0xFFFFF42D)) {
            class381 var6 = new class381(var5);
            this.field642.method1766(var4.field2539, var6, arg0 ^ 0xFFFFFF84);
            this.field647.method363(true, var6);
            var6.field86 = 0L;
            var4.method1120(arg0 ^ 0x3A);
            var4.method90((byte) -53);
        } else {
            this.field647.method363(true, var4);
            var4.field86 = 0L;
        }
        if (arg0 != 69) {
            this.method338(96);
        }
        return var5;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method332(byte arg0) {
        field638++;
        class328 var2 = (class328) this.field642.method1773(-1);
        while (var2 != null) {
            Object var3 = var2.method1255(7756);
            if (var3 != null) {
                return var3;
            }
            class328 var4 = var2;
            var2 = (class328) this.field642.method1773(-1);
            var4.method1120(58);
            var4.method90((byte) -53);
            this.field635++;
        }
        if (arg0 < 61) {
            this.method333(false, 91L);
        }
        return null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZJ)V")
    private final void method333(boolean arg0, long arg1) {
        field637++;
        class328 var4 = (class328) this.field642.method1770(-880, arg1);
        if (var4 != null) {
            var4.method1120(-122);
            var4.method90((byte) -53);
            this.field635++;
        }
        if (arg0) {
            this.field647 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method334(int arg0) {
        field633++;
        class328 var2 = (class328) this.field642.method1776(true);
        if (arg0 != 1) {
            return null;
        }
        while (var2 != null) {
            Object var3 = var2.method1255(7756);
            if (var3 != null) {
                return var3;
            }
            class328 var4 = var2;
            var2 = (class328) this.field642.method1773(-1);
            var4.method1120(71);
            var4.method90((byte) -53);
            this.field635++;
        }
        return null;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V")
    public final void method335(byte arg0) {
        field649++;
        this.field647.method357((byte) 101);
        this.field642.method1764(88);
        int var2 = 29 / ((8 - arg0) / 49);
        this.field635 = this.field648;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public final void method336(int arg0) {
        field643++;
        class328 var2 = (class328) this.field647.method364(0);
        int var3 = 16 / ((arg0 - 12) / 55);
        while (var2 != null) {
            if (var2.method1256(-2968)) {
                var2.method1120(-85);
                var2.method90((byte) -53);
                this.field635++;
            }
            var2 = (class328) this.field647.method361(66);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)V")
    public final void method337(int arg0, byte arg1) {
        field634++;
        if (class281.field4508 != null) {
            for (class328 var3 = (class328) this.field647.method364(0); var3 != null; var3 = (class328) this.field647.method361(111)) {
                if (var3.method1256(-2968)) {
                    if (var3.method1255(7756) == null) {
                        var3.method1120(99);
                        var3.method90((byte) -53);
                        this.field635++;
                    }
                } else if (((long) arg0) < (++var3.field86)) {
                    class328 var4 = class281.field4508.method857((byte) -94, var3);
                    this.field642.method1766(var3.field2539, var4, -50);
                    class56.method366(var4, 0, var3);
                    var3.method1120(-96);
                    var3.method90((byte) -53);
                }
            }
        }
        if (arg1 > -103) {
            method330((byte) -83);
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)I")
    public final int method338(int arg0) {
        field652++;
        if (arg0 != -19696) {
            this.method334(-45);
        }
        return this.field635;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(B)I")
    public final int method339(byte arg0) {
        int var2 = -13 / ((-arg0 - 60) / 42);
        field655++;
        return this.field648;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)I")
    public final int method340(int arg0) {
        field645++;
        int var2 = arg0;
        for (class328 var3 = (class328) this.field647.method364(0); var3 != null; var3 = (class328) this.field647.method361(62)) {
            if (!var3.method1256(-2968)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IJLjava/lang/Object;)V")
    public final void method341(int arg0, long arg1, Object arg2) {
        this.method333(false, arg1);
        field639++;
        if (this.field635 == 0) {
            class328 var5 = (class328) this.field647.method358(0);
            var5.method1120(-93);
            var5.method90((byte) -53);
        } else {
            this.field635--;
        }
        if (arg0 < 42) {
            this.method332((byte) 28);
        }
        class381 var6 = new class381(arg2);
        this.field642.method1766(arg1, var6, 87);
        this.field647.method363(true, var6);
        var6.field86 = 0L;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V")
    public class52(int arg0) {
        this.field635 = arg0;
        this.field648 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field642 = new class256(var2);
    }
}
