import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class264 extends class45 {

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
    public int field4430;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    public int field4431;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "[[I")
    public int[][] field4425;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "[I")
    public int[] field4434;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "[Z")
    public boolean[] field4435;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "[I")
    public int[] field4423;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
    public static int field4426 = 0;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "J")
    public static volatile long field4428 = 0L;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "[[I")
    public static int[][] field4427 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "Z")
    public static boolean field4429 = true;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IS)Z", line = 5)
    public static final boolean method2009(int arg0, short arg1) {
        field4433++;
        if (arg1 == 38 || arg1 == 42 || arg1 == 25 || arg1 == 60 || arg1 == 57 || arg1 == 33 || arg1 == 11 || arg1 == 20) {
            return true;
        } else if (arg1 == 43 || arg1 == 16 || arg1 == 1001 || arg1 == 1010) {
            return true;
        } else if (arg0 < 75) {
            return true;
        } else if (arg1 == 21 || arg1 == 17 || arg1 == 22 || arg1 == 41 || arg1 == 4) {
            return true;
        } else {
            return arg1 == 6 || arg1 == 24 || arg1 == 9 || arg1 == 14 || arg1 == 47 || arg1 == 31;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BC)Z", line = 42)
    public static final boolean method2010(byte arg0, char arg1) {
        field4424++;
        if (arg0 != 33) {
            field4426 = 6;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lna;ILjava/lang/Object;)V", line = 62)
    public static final void method2011(class145 arg0, int arg1, Object arg2) {
        field4436++;
        if (arg0.field2358 == null) {
            return;
        }
        for (int var3 = arg1; var3 < 50 && arg0.field2358.peekEvent() != null; var3++) {
            class283.method2076((byte) -122, 1L);
        }
        if (arg2 != null) {
            arg0.field2358.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lth;ZII)Lml;", line = 84)
    public static final class17 method2012(class57 arg0, boolean arg1, int arg2, int arg3) {
        field4437++;
        if (class315.method2233(arg3, (byte) 111, arg0, arg2)) {
            if (!arg1) {
                method2010((byte) -23, (char) 65445);
            }
            return class14.method78((byte) 47);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V", line = 98)
    public static void method2013(int arg0) {
        if (arg0 == 1) {
            field4427 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(I[B)V", line = 113)
    public class264(int arg0, byte[] arg1) {
        this.field4430 = arg0;
        class227 var3 = new class227(arg1);
        this.field4431 = var3.method1720((byte) -67);
        this.field4425 = new int[this.field4431][];
        this.field4434 = new int[this.field4431];
        this.field4435 = new boolean[this.field4431];
        this.field4423 = new int[this.field4431];
        for (int var4 = 0; var4 < this.field4431; var4++) {
            this.field4434[var4] = var3.method1720((byte) -121);
        }
        for (int var5 = 0; var5 < this.field4431; var5++) {
            this.field4435[var5] = var3.method1720((byte) -112) == 1;
        }
        for (int var6 = 0; var6 < this.field4431; var6++) {
            this.field4423[var6] = var3.method1765(true);
        }
        for (int var7 = 0; var7 < this.field4431; var7++) {
            this.field4425[var7] = new int[var3.method1720((byte) -76)];
        }
        for (int var8 = 0; var8 < this.field4431; var8++) {
            for (int var9 = 0; var9 < this.field4425[var8].length; var9++) {
                this.field4425[var8][var9] = var3.method1720((byte) -116);
            }
        }
    }
}
