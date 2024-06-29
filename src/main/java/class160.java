import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class160 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    private int field2691 = -1;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    private int field2692 = 0;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "Luh;")
    private class198 field2704 = new class198();

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "Z")
    public boolean field2707 = false;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    private int field2694;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    private int field2699;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "[[I")
    private int[][] field2705;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "[Lbd;")
    private class124[] field2693;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Lub;")
    public static class227 field2697 = class257.method1749("sl_arrows", 17263);

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "Lub;")
    public static class227 field2701 = class257.method1749(" weitere Optionen", 17263);

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Lub;")
    private static class227 field2695 = class257.method1749("red:", 17263);

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "Lub;")
    public static class227 field2706 = field2695;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Lub;")
    public static class227 field2700 = field2695;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    public final void method983(boolean arg0) {
        for (int var2 = 0; var2 < this.field2694; var2++) {
            this.field2705[var2] = null;
        }
        if (!arg0) {
            this.method986((byte) -115);
        }
        this.field2693 = null;
        this.field2705 = null;
        field2698++;
        this.field2704.method1274((byte) 109);
        this.field2704 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)[I")
    public final int[] method984(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        }
        field2696++;
        if (this.field2699 == this.field2694) {
            this.field2707 = this.field2693[arg0] == null;
            this.field2693[arg0] = class30.field490;
            return this.field2705[arg0];
        } else if (this.field2694 == 1) {
            this.field2707 = this.field2691 != arg0;
            this.field2691 = arg0;
            return this.field2705[0];
        } else {
            class124 var3 = this.field2693[arg0];
            if (var3 == null) {
                this.field2707 = true;
                if (this.field2692 >= this.field2694) {
                    class124 var4 = (class124) this.field2704.method1270(arg1);
                    var3 = new class124(arg0, var4.field2224);
                    this.field2693[var4.field2227] = null;
                    var4.method369(124);
                } else {
                    var3 = new class124(arg0, this.field2692);
                    this.field2692++;
                }
                this.field2693[arg0] = var3;
            } else {
                this.field2707 = false;
            }
            this.field2704.method1275(-18157, var3);
            return this.field2705[var3.field2224];
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Lij;")
    public static final class50 method985(int arg0, int arg1, int arg2) {
        class108 var3 = class261.field4539[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class50 var4 = var3.field2024;
            var3.field2024 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)[[I")
    public final int[][] method986(byte arg0) {
        field2702++;
        if (this.field2699 != this.field2694) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2694; var2++) {
            this.field2693[var2] = class30.field490;
        }
        if (arg0 > -58) {
            this.method984(117, 102);
        }
        return this.field2705;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static void method987(int arg0) {
        field2701 = null;
        field2706 = null;
        int var1 = -96 % ((arg0 - 1) / 34);
        field2697 = null;
        field2700 = null;
        field2695 = null;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(III)V")
    public class160(int arg0, int arg1, int arg2) {
        this.field2694 = arg0;
        this.field2699 = arg1;
        this.field2705 = new int[this.field2694][arg2];
        this.field2693 = new class124[this.field2699];
    }
}
