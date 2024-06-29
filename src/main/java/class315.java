import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class315 {

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    private int field4596 = 0;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    private int field4590 = -1;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "Leea;")
    private class114 field4587 = new class114();

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Z")
    public boolean field4602 = false;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    private int field4595;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    private int field4598;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "[[I")
    private int[][] field4600;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "[Lvo;")
    private class37[] field4593;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field4597 = 0;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "Lea;")
    public static class474 field4604;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "[I")
    public static int[] field4603;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)[I")
    public final int[] method2069(int arg0, int arg1) {
        field4599++;
        if (arg0 != -2) {
            return null;
        } else if (this.field4598 == this.field4595) {
            this.field4602 = this.field4593[arg1] == null;
            this.field4593[arg1] = class430.field6368;
            return this.field4600[arg1];
        } else if (this.field4595 == 1) {
            this.field4602 = this.field4590 != arg1;
            this.field4590 = arg1;
            return this.field4600[0];
        } else {
            class37 var3 = this.field4593[arg1];
            if (var3 == null) {
                this.field4602 = true;
                if (this.field4596 >= this.field4595) {
                    class37 var4 = (class37) this.field4587.method711(-31729);
                    var3 = new class37(arg1, var4.field410);
                    this.field4593[var4.field404] = null;
                    var4.method2108(true);
                } else {
                    var3 = new class37(arg1, this.field4596);
                    this.field4596++;
                }
                this.field4593[arg1] = var3;
            } else {
                this.field4602 = false;
            }
            this.field4587.method710(var3, 60);
            return this.field4600[var3.field410];
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)I")
    public static final int method2070(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4592++;
        if (arg1 != 12095) {
            field4597 = -83;
        }
        int var5 = arg3 & 0xF;
        int var6 = var5 < 8 ? arg4 : arg0;
        int var7 = var5 < 4 ? arg0 : (var5 == 12 || var5 == 14 ? arg4 : arg2);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Z")
    public static final boolean method2071(int arg0) {
        if (arg0 != 0) {
            return true;
        }
        field4594++;
        if (class436.field6484) {
            try {
                class314.method2067(-24319, "showVideoAd", class635.field9135);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public static final void method2072(byte arg0) {
        if (arg0 != -12) {
            field4603 = null;
        }
        field4588++;
        if (class101.field1202 != null && class215.field2959 != null) {
            return;
        }
        class215.field2959 = new int[256];
        class101.field1202 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class101.field1202[var1] = (int) (Math.sin(var2) * 4096.0D);
            class215.field2959[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I[[[Luaa;)V")
    public static final void method2073(int arg0, class99[][][] arg1) {
        int var2 = 0;
        if (arg0 != -8644) {
            field4603 = null;
        }
        while (var2 < arg1.length) {
            class99[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class99 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field1174 instanceof class57) {
                            ((class57) var6.field1174).method87(arg0 + 16155);
                        }
                        if (var6.field1175 instanceof class57) {
                            ((class57) var6.field1175).method87(7511);
                        }
                        if (var6.field1161 instanceof class57) {
                            ((class57) var6.field1161).method87(7511);
                        }
                        if (var6.field1168 instanceof class57) {
                            ((class57) var6.field1168).method87(7511);
                        }
                        if (var6.field1176 instanceof class57) {
                            ((class57) var6.field1176).method87(arg0 + 16155);
                        }
                        for (class104 var7 = var6.field1167; var7 != null; var7 = var7.field1251) {
                            class144 var8 = var7.field1253;
                            if (var8 instanceof class57) {
                                ((class57) var8).method87(7511);
                            }
                        }
                    }
                }
            }
            var2++;
        }
        field4586++;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
    public final void method2074(byte arg0) {
        for (int var2 = 0; var2 < this.field4595; var2++) {
            this.field4600[var2] = null;
        }
        field4591++;
        this.field4593 = null;
        if (arg0 == -90) {
            this.field4600 = null;
            this.field4587.method718(-115);
            this.field4587 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(JLoa;B)V")
    public static final void method2075(long arg0, class605 arg1, byte arg2) {
        class239.field3401 = class73.field779;
        field4589++;
        class403.field6090 = 0;
        class73.field779 = 0;
        long var4 = class84.method550((byte) -97);
        for (class211 var6 = (class211) class132.field1661.method3297(arg2); var6 != null; var6 = (class211) class132.field1661.method3296((byte) -128)) {
            if (var6.method1336(arg1, arg0)) {
                class403.field6090++;
            }
        }
        if (class83.field948 && (arg0 % 100L) == 0L) {
            System.out.println("Particle system count: " + class132.field1661.method3288((byte) -88) + ", running: " + class403.field6090 + ". Particles: " + class73.field779 + ". Time taken: " + (class84.method550((byte) -125) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
    public static void method2076(int arg0) {
        if (arg0 != -29604) {
            method2071(116);
        }
        field4603 = null;
        field4604 = null;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(B)[[I")
    public final int[][] method2077(byte arg0) {
        field4601++;
        if (arg0 <= 89) {
            return null;
        } else if (this.field4598 == this.field4595) {
            for (int var2 = 0; var2 < this.field4595; var2++) {
                this.field4593[var2] = class430.field6368;
            }
            return this.field4600;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(III)V")
    public class315(int arg0, int arg1, int arg2) {
        this.field4595 = arg0;
        this.field4598 = arg1;
        this.field4600 = new int[this.field4595][arg2];
        this.field4593 = new class37[this.field4598];
    }

    static {
        new class474("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field4604 = new class474("glow2:", "leuchten2:", "brillant2:", "brilho2:");
    }
}
