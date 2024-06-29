import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class59 extends class366 {

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "Z")
    public boolean field799 = true;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "[I")
    public static int[] field794 = new int[2];

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "Z")
    public static boolean field791 = false;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "[I")
    public static int[] field795 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "J")
    public static long field803 = 0L;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "Lvq;")
    public static class269 field786;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field808;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ri", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field809;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ri", name = "bb", descriptor = "Ljava/lang/Class;")
    public static Class field810;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "[I")
    private int[] field788;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "[I")
    public int[] field798;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field784;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "[[I")
    private int[][] field787;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BII)B")
    public static final byte method382(byte arg0, int arg1, int arg2) {
        field790++;
        if (arg1 != 9) {
            return 0;
        } else if (arg0 == 70) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return -80;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Llf;B[I)V")
    public final void method383(class130 arg0, byte arg1, int[] arg2) {
        field797++;
        if (this.field788 == null) {
            return;
        }
        int var4 = 36 % ((arg1 - 37) / 63);
        for (int var5 = 0; var5 < this.field788.length; var5++) {
            if (arg2.length <= var5) {
                return;
            }
            int var6 = class65.field890[this.method384(var5, true)];
            if (var6 > 0) {
                arg0.method818((long) arg2[var5], 101, var6);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)I")
    public final int method384(int arg0, boolean arg1) {
        field793++;
        if (!arg1) {
            this.method386(98);
        }
        return this.field788 == null || arg0 < 0 || arg0 > this.field788.length ? -1 : this.field788[arg0];
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Llf;I)V")
    public final void method385(class130 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method837(true);
            if (var3 == 0) {
                field800++;
                if (arg1 != -1021) {
                    this.method384(-41, true);
                    return;
                }
                return;
            }
            this.method393(arg0, var3, 60);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public final void method386(int arg0) {
        if (this.field798 != null) {
            for (int var2 = 0; var2 < this.field798.length; var2++) {
                this.field798[var2] = class332.method2176(this.field798[var2], 32768);
            }
        }
        int var3 = 120 % ((85 - arg0) / 37);
        field802++;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(BII)I")
    public final int method387(byte arg0, int arg1, int arg2) {
        int var4 = -33 % ((arg0 - 48) / 37);
        field796++;
        if (this.field788 == null || arg2 < 0 || this.field788.length < arg2) {
            return -1;
        } else if (this.field787[arg2] == null || arg1 < 0 || arg1 > this.field787[arg2].length) {
            return -1;
        } else {
            return this.field787[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
    public static void method388(int arg0) {
        if (arg0 != 9824) {
            method391((byte) -85, (class223) null);
        }
        field786 = null;
        field795 = null;
        field794 = null;
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(B)Ljava/lang/String;")
    public final String method389(byte arg0) {
        field804++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field784 == null) {
            return "";
        }
        var2.append(this.field784[0]);
        for (int var3 = 1; var3 < this.field784.length; var3++) {
            var2.append("...");
            var2.append(this.field784[var3]);
        }
        if (arg0 > -71) {
            this.method386(57);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(Z)I")
    public final int method390(boolean arg0) {
        if (arg0) {
            this.method387((byte) 94, 70, 77);
        }
        field792++;
        return this.field788 == null ? 0 : this.field788.length;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLbr;)Lbr;")
    public static final class223 method391(byte arg0, class223 arg1) {
        field807++;
        class223 var2 = client.method1176(arg1);
        if (var2 == null) {
            var2 = arg1.field3272;
        }
        if (arg0 < 18) {
            field803 = -32L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILbk;Lml;Ljava/awt/Canvas;I)Lvq;")
    public static final class269 method392(int arg0, int arg1, class211 arg2, class219 arg3, Canvas arg4, int arg5) {
        field805++;
        if (arg1 != -1) {
            field803 = 112L;
        }
        try {
            Class var6 = Class.forName("ig");
            Constructor var7 = var6.getConstructor(field808 == null ? (field808 = method395("java.awt.Canvas")) : field808, field809 == null ? (field809 = method395("bk")) : field809, Integer.TYPE, Integer.TYPE, field810 == null ? (field810 = method395("ml")) : field810);
            return (class269) var7.newInstance(arg4, arg2, Integer.valueOf(arg0), new Integer(arg5), arg3);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Llf;II)V")
    private final void method393(class130 arg0, int arg1, int arg2) {
        field789++;
        if (arg2 != 60) {
            return;
        }
        if (arg1 == 1) {
            this.field784 = class190.method1362(arg0.method843(-114), '<', (byte) 126);
        } else if (arg1 == 2) {
            int var4 = arg0.method837(true);
            this.field798 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field798[var5] = arg0.method798(false);
            }
            return;
        } else if (arg1 == 3) {
            int var6 = arg0.method837(true);
            this.field787 = new int[var6][];
            this.field788 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method798(false);
                this.field788[var7] = var8;
                this.field787[var7] = new int[class284.field4130[var8]];
                for (int var9 = 0; var9 < class284.field4130[var8]; var9++) {
                    this.field787[var7][var9] = arg0.method798(false);
                }
            }
            return;
        } else if (arg1 == 4) {
            this.field799 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Llf;I)Ljava/lang/String;")
    public final String method394(class130 arg0, int arg1) {
        field785++;
        StringBuffer var3 = new StringBuffer(arg1);
        if (this.field788 != null) {
            for (int var4 = 0; var4 < this.field788.length; var4++) {
                var3.append(this.field784[var4]);
                var3.append(class207.method1477(arg0.method829(class118.field1605[this.field788[var4]], (byte) -115), this.field787[var4], (byte) 115, this.field788[var4]));
            }
        }
        var3.append(this.field784[this.field784.length - 1]);
        return var3.toString();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method395(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
