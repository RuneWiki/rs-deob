import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class382 extends class312 {

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public int field5608 = 0;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Z")
    private boolean field5611 = false;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Z")
    public boolean field5606 = false;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Lhv;")
    private class150 field5610 = new class150();

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    private int field5614 = 0;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Lnv;")
    public class44 field5615 = new class44();

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    private int field5620 = 0;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "Z")
    private boolean field5617 = false;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Lvm;")
    public class320 field5616 = new class320();

    @OriginalMember(owner = "client!td", name = "h", descriptor = "[Lgg;")
    public class217[] field5605 = new class217[8192];

    @OriginalMember(owner = "client!td", name = "l", descriptor = "J")
    private long field5609;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "J")
    private long field5612;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "[Z")
    private static boolean[] field5607 = new boolean[8];

    @OriginalMember(owner = "client!td", name = "p", descriptor = "[Z")
    private static boolean[] field5613 = new boolean[8];

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public int field5618;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public int field5619;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public int field5621;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public int field5622;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public int field5623;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()V")
    public final void method2420() {
        this.field5616.field4847.method1450(-25864);
        for (class178 var1 = (class178) this.field5610.method1076((byte) 126); var1 != null; var1 = (class178) this.field5610.method1077(-1)) {
            var1.method1257(this.field5612, (byte) 74);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lza;J[Lod;[Lu;Z)V")
    public final void method2421(class299 arg0, long arg1, class476[] arg2, class349[] arg3, boolean arg4) {
        if (!this.field5606) {
            this.method2427(arg0, arg2, arg4);
            this.method2429(arg3, arg4);
            this.field5609 = arg1;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()V")
    public static void method2422() {
        field5607 = null;
        field5613 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(J)V")
    public final void method2423(long arg0) {
        this.field5609 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()Lvm;")
    public final class320 method2424() {
        return this.field5616;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lza;J)Z")
    public final boolean method2425(class299 arg0, long arg1) {
        if (this.field5612 == this.field5609) {
            this.method2432();
        } else {
            this.method2430();
        }
        if (arg1 - this.field5609 > 750L) {
            this.method2428();
            return false;
        }
        int var4 = (int) (arg1 - this.field5612);
        if (this.field5617) {
            for (class178 var5 = (class178) this.field5610.method1076((byte) 114); var5 != null; var5 = (class178) this.field5610.method1077(-1)) {
                for (int var6 = 0; var6 < var5.field2745.field7796; var6++) {
                    var5.method1259(1, arg1, arg0, !this.field5611, (byte) 74);
                }
            }
            this.field5617 = false;
        }
        for (class178 var7 = (class178) this.field5610.method1076((byte) 124); var7 != null; var7 = (class178) this.field5610.method1077(-1)) {
            var7.method1259(var4, arg1, arg0, !this.field5611, (byte) 32);
        }
        this.field5612 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "()V")
    public final void method2426() {
        this.field5617 = true;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lza;[Lod;Z)V")
    private final void method2427(class299 arg0, class476[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field5607[var4] = false;
        }
        label64: for (class178 var5 = (class178) this.field5610.method1076((byte) 64); var5 != null; var5 = (class178) this.field5610.method1077(-1)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field2755 || arg1[var8].field6964 == var5.field2755) {
                        field5607[var8] = true;
                        var5.method1263(-1);
                        var5.field2729 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field2731 == 0) {
                    var5.method2069(-11);
                    this.field5614--;
                } else {
                    var5.field2729 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field5614 != 8; var6++) {
            if (!field5607[var6]) {
                class178 var7 = new class178(arg0, arg1[var6], this, this.field5609);
                this.field5610.method1082(var7, 24);
                this.field5614++;
                field5607[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "()V")
    public final void method2428() {
        this.field5606 = true;
        for (class374 var1 = (class374) this.field5615.method295((byte) 118); var1 != null; var1 = (class374) this.field5615.method296(true)) {
            if (var1.field5532.field7395 == 1) {
                var1.method2859(-124);
            }
        }
        this.field5605 = new class217[8192];
        this.field5608 = 0;
        this.field5610 = new class150();
        this.field5614 = 0;
        this.field5615 = new class44();
        this.field5620 = 0;
        this.method2069(-11);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([Lu;Z)V")
    private final void method2429(class349[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field5613[var3] = false;
        }
        label73: for (class374 var4 = (class374) this.field5615.method295((byte) -119); var4 != null; var4 = (class374) this.field5615.method296(true)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field5529 || arg0[var7].field5207 == var4.field5529) {
                        field5613[var7] = true;
                        var4.method2396(15793);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method947((byte) 122);
                this.field5620--;
                if (var4.method2860(2)) {
                    var4.method2859(-114);
                    class71.field1133--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field5620 != 8; var5++) {
            if (!field5613[var5]) {
                class374 var6 = null;
                if (arg0[var5].method2242(-128).field7395 == 1 && class71.field1133 < 32) {
                    var6 = new class374(arg0[var5], this);
                    class472.field6928.method2787(-1, var6, (long) arg0[var5].field5199);
                    class71.field1133++;
                }
                if (var6 == null) {
                    var6 = new class374(arg0[var5], this);
                }
                this.field5615.method292((byte) 121, var6);
                this.field5620++;
                field5613[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "()V")
    public final void method2430() {
        this.field5611 = true;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
    public final void method2431(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5619 = arg0;
        this.field5621 = arg1;
        this.field5623 = arg2;
        this.field5618 = arg3;
        this.field5622 = arg4;
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "()V")
    private final void method2432() {
        this.field5611 = false;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I)V")
    public class382(int arg0) {
        class73.field1251.method1082(this, 113);
        this.field5609 = arg0;
        this.field5612 = arg0;
        this.field5617 = true;
    }
}
