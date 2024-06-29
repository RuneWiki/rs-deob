import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EHYLCNJX")
public class class15 {

    @OriginalMember(owner = "client!EHYLCNJX", name = "g", descriptor = "I")
    public int field842 = -1;

    @OriginalMember(owner = "client!EHYLCNJX", name = "i", descriptor = "Z")
    public boolean field844 = false;

    @OriginalMember(owner = "client!EHYLCNJX", name = "j", descriptor = "I")
    public int field845 = 5;

    @OriginalMember(owner = "client!EHYLCNJX", name = "k", descriptor = "I")
    public int field846 = -1;

    @OriginalMember(owner = "client!EHYLCNJX", name = "l", descriptor = "I")
    public int field847 = -1;

    @OriginalMember(owner = "client!EHYLCNJX", name = "m", descriptor = "I")
    public int field848 = 99;

    @OriginalMember(owner = "client!EHYLCNJX", name = "n", descriptor = "I")
    public int field849 = -1;

    @OriginalMember(owner = "client!EHYLCNJX", name = "o", descriptor = "I")
    public int field850 = -1;

    @OriginalMember(owner = "client!EHYLCNJX", name = "p", descriptor = "I")
    public int field851 = 2;

    @OriginalMember(owner = "client!EHYLCNJX", name = "a", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!EHYLCNJX", name = "c", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "client!EHYLCNJX", name = "q", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "client!EHYLCNJX", name = "r", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!EHYLCNJX", name = "d", descriptor = "[I")
    public int[] field839;

    @OriginalMember(owner = "client!EHYLCNJX", name = "e", descriptor = "[I")
    public int[] field840;

    @OriginalMember(owner = "client!EHYLCNJX", name = "f", descriptor = "[I")
    private int[] field841;

    @OriginalMember(owner = "client!EHYLCNJX", name = "h", descriptor = "[I")
    public int[] field843;

    @OriginalMember(owner = "client!EHYLCNJX", name = "b", descriptor = "[LEHYLCNJX;")
    public static class15[] field837;

    @OriginalMember(owner = "client!EHYLCNJX", name = "a", descriptor = "(LFUZJMGZB;I)V")
    public static void method251(class19 arg0, int arg1) {
        class32 var2 = new class32((byte) 114, arg0.method277("seq.dat", null));
        field836 = var2.method371();
        if (arg1 != 5) {
            return;
        }
        if (field837 == null) {
            field837 = new class15[field836];
        }
        for (int var3 = 0; var3 < field836; var3++) {
            if (field837[var3] == null) {
                field837[var3] = new class15();
            }
            field837[var3].method253(var2, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!EHYLCNJX", name = "a", descriptor = "(II)I")
    public int method252(int arg0, int arg1) {
        int var3 = this.field841[arg0];
        if (arg1 != -26977) {
            return 4;
        }
        if (var3 == 0) {
            class46 var4 = class46.method468(this.field839[arg0]);
            if (var4 != null) {
                var3 = this.field841[arg0] = var4.field1319;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!EHYLCNJX", name = "a", descriptor = "(LLBBVYYXO;B)V")
    public void method253(class32 arg0, byte arg1) {
        if (arg1 != 59) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method369();
                if (var3 == 0) {
                    if (this.field838 == 0) {
                        this.field838 = 1;
                        this.field839 = new int[1];
                        this.field839[0] = -1;
                        this.field840 = new int[1];
                        this.field840[0] = -1;
                        this.field841 = new int[1];
                        this.field841[0] = -1;
                    }
                    if (this.field849 == -1) {
                        if (this.field843 == null) {
                            this.field849 = 0;
                        } else {
                            this.field849 = 2;
                        }
                    }
                    if (this.field850 == -1) {
                        if (this.field843 != null) {
                            this.field850 = 2;
                            return;
                        }
                        this.field850 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field838 = arg0.method369();
                    this.field839 = new int[this.field838];
                    this.field840 = new int[this.field838];
                    this.field841 = new int[this.field838];
                    for (int var4 = 0; var4 < this.field838; var4++) {
                        this.field839[var4] = arg0.method371();
                        this.field840[var4] = arg0.method371();
                        if (this.field840[var4] == 65535) {
                            this.field840[var4] = -1;
                        }
                        this.field841[var4] = arg0.method371();
                    }
                } else if (var3 == 2) {
                    this.field842 = arg0.method371();
                } else if (var3 == 3) {
                    int var5 = arg0.method369();
                    this.field843 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field843[var6] = arg0.method369();
                    }
                    this.field843[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field844 = true;
                } else if (var3 == 5) {
                    this.field845 = arg0.method369();
                } else if (var3 == 6) {
                    this.field846 = arg0.method371();
                } else if (var3 == 7) {
                    this.field847 = arg0.method371();
                } else if (var3 == 8) {
                    this.field848 = arg0.method369();
                } else if (var3 == 9) {
                    this.field849 = arg0.method369();
                } else if (var3 == 10) {
                    this.field850 = arg0.method369();
                } else if (var3 == 11) {
                    this.field851 = arg0.method369();
                } else if (var3 == 12) {
                    this.field852 = arg0.method374();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
