import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class467 {

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    private int field6937 = 0;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    private int field6926 = -1;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Lpu;")
    private class411 field6928 = new class411();

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "Z")
    public boolean field6942 = false;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    private int field6932;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    private int field6935;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "[[[I")
    private int[][][] field6931;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "[Lps;")
    private class5[] field6927;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "Llo;")
    public static class306 field6930 = new class306("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "J")
    public static long field6941 = 0L;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "Lhn;")
    public static class284 field6940;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Lqs;")
    public static class496 field6939;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method2772(boolean arg0) {
        field6934++;
        if (!class508.field7386) {
            return;
        }
        class68 var1 = class453.method2708(class345.field5413, 77, class75.field1309);
        if (var1 != null && var1.field1128 != null) {
            class483 var2 = new class483();
            var2.field7100 = var1;
            var2.field7101 = var1.field1128;
            class521.method3073(var2);
        }
        class102.field1688 = -1;
        class421.field6365 = -1;
        class508.field7386 = arg0;
        if (var1 != null) {
            class396.method2476(var1, 1);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 33)
    public static void method2773(int arg0) {
        field6939 = null;
        field6930 = null;
        field6940 = null;
        if (arg0 != 0) {
            field6930 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 47)
    public static final void method2774(String arg0, byte arg1) {
        class81.method588("", 0, (byte) 98, arg0, 0, "");
        field6929++;
        if (arg1 < 57) {
            field6940 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)[[[I", line = 64)
    public final int[][][] method2775(boolean arg0) {
        field6936++;
        if (this.field6935 != this.field6932) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0) {
            return null;
        } else {
            for (int var2 = 0; var2 < this.field6932; var2++) {
                this.field6927[var2] = class511.field7487;
            }
            return this.field6931;
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(III)V", line = 202)
    public class467(int arg0, int arg1, int arg2) {
        this.field6932 = arg0;
        this.field6935 = arg1;
        this.field6931 = new int[this.field6932][3][arg2];
        this.field6927 = new class5[this.field6935];
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V", line = 93)
    public final void method2776(int arg0) {
        field6933++;
        for (int var2 = 0; var2 < this.field6932; var2++) {
            this.field6931[var2][0] = null;
            this.field6931[var2][1] = null;
            this.field6931[var2][2] = null;
            this.field6931[var2] = null;
        }
        this.field6931 = null;
        this.field6927 = null;
        this.field6928.method2543(7655);
        int var3 = 31 % (-arg0 / 45);
        this.field6928 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)[[I", line = 118)
    public final int[][] method2777(int arg0, int arg1) {
        if (arg1 != 0) {
            method2773(6);
        }
        field6938++;
        if (this.field6935 == this.field6932) {
            this.field6942 = this.field6927[arg0] == null;
            this.field6927[arg0] = class511.field7487;
            return this.field6931[arg0];
        } else if (this.field6932 == 1) {
            this.field6942 = this.field6926 != arg0;
            this.field6926 = arg0;
            return this.field6931[0];
        } else {
            class5 var3 = this.field6927[arg0];
            if (var3 == null) {
                this.field6942 = true;
                if (this.field6932 > this.field6937) {
                    var3 = new class5(arg0, this.field6937);
                    this.field6937++;
                } else {
                    class5 var4 = (class5) this.field6928.method2546((byte) -97);
                    var3 = new class5(arg0, var4.field49);
                    this.field6927[var4.field54] = null;
                    var4.method1821((byte) -77);
                }
                this.field6927[arg0] = var3;
            } else {
                this.field6942 = false;
            }
            this.field6928.method2545(var3, 4009);
            return this.field6931[var3.field49];
        }
    }
}
