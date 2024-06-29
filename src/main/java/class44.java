import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class44 extends class280 {

    @OriginalMember(owner = "client!le", name = "A", descriptor = "F")
    public static float field642 = 0.0F;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field636 = 0;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field645 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "[I")
    public int[] field630;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "[I")
    public int[] field635;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "[I")
    public int[] field639;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "[Lh;")
    public class278[] field633;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "[Lh;")
    public class278[] field640;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "[[[B")
    public byte[][][] field637;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
    public static final void method331(boolean arg0) {
        field646++;
        for (class17 var1 = (class17) class124.field1806.method1033(-9843); var1 != null; var1 = (class17) class124.field1806.method1031((byte) -7)) {
            int var2 = var1.field191;
            if (class184.method1364(var2, (byte) 108)) {
                boolean var3 = true;
                class131[] var4 = class113.field1631[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field2077;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field4459;
                    class131 var7 = class122.method891(var6, (byte) -124);
                    if (var7 != null) {
                        class274.method1896(var7, 10);
                    }
                }
            }
        }
        if (arg0) {
            method332(52);
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
    public static void method332(int arg0) {
        field645 = null;
        if (arg0 != 29931) {
            method335(-79, 100L);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBZI)V")
    public static final void method333(int arg0, byte arg1, boolean arg2, int arg3) {
        field634++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class36.field454 = arg3;
        class216.field3439 = arg2;
        class28.field329 = arg0;
        if (arg1 != 40) {
            method334(90, 42, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIB)V")
    public static final void method334(int arg0, int arg1, byte arg2) {
        if (arg2 >= -69) {
            field647 = -91;
        }
        field632++;
        class243.field3904[arg0] = arg1;
        class100 var3 = (class100) class262.field4266.method1034((long) arg0, (byte) 21);
        if (var3 == null) {
            class100 var4 = new class100(class197.method1454((byte) -104) + 500L);
            class262.field4266.method1032(false, var4, (long) arg0);
        } else {
            var3.field1470 = class197.method1454((byte) -104) + 500L;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IJ)V")
    public static final void method335(int arg0, long arg1) {
        field643++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = arg0; var3 < class20.field222; var3++) {
            if (class57.field819[var3] == arg1) {
                class20.field222--;
                class174.field2838++;
                for (int var4 = var3; var4 < class20.field222; var4++) {
                    class104.field1508[var4] = class104.field1508[var4 + 1];
                    class105.field1523[var4] = class105.field1523[var4 + 1];
                    class290.field4596[var4] = class290.field4596[var4 + 1];
                    class57.field819[var4] = class57.field819[var4 + 1];
                    class206.field3313[var4] = class206.field3313[var4 + 1];
                    class42.field584[var4] = class42.field584[var4 + 1];
                }
                class76.field1089 = class231.field3717;
                class220.field3532.method557(225, 8);
                class220.field3532.method1069(arg1, -80);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)I")
    public static final int method336(int arg0) {
        int var1 = -45 % ((4 - arg0) / 56);
        field631++;
        return 6;
    }
}
