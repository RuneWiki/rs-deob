import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class87 {

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    private int field1219 = 0;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    private int field1221 = -1;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "Ljm;")
    private class162 field1215 = new class162();

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "Z")
    public boolean field1228 = false;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "[Lsa;")
    private class412[] field1222;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "[[[I")
    private int[][][] field1217;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public static int field1225 = 0;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "[Lof;")
    public static class423[] field1227;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)V")
    public static final void method689(int arg0, byte arg1) {
        class191.field2756 = new int[arg0];
        field1214++;
        class344.field4658 = new int[arg0];
        if (arg1 < 51) {
            field1227 = null;
        }
        class196.field2844 = new int[arg0];
        class149.field2164 = new int[arg0];
        class219.field3080 = new int[arg0];
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public final void method690(int arg0) {
        for (int var2 = 0; var2 < this.field1220; var2++) {
            this.field1217[var2][0] = null;
            this.field1217[var2][1] = null;
            this.field1217[var2][2] = null;
            this.field1217[var2] = null;
        }
        field1218++;
        this.field1222 = null;
        if (arg0 != 2) {
            this.field1220 = -76;
        }
        this.field1217 = null;
        this.field1215.method1168(124);
        this.field1215 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZII[Lvg;I)V")
    public static final void method691(int arg0, boolean arg1, int arg2, int arg3, class108[] arg4, int arg5) {
        int var6 = -67 / ((arg5 - 40) / 42);
        for (int var7 = 0; var7 < arg4.length; var7++) {
            class108 var8 = arg4[var7];
            if (var8 != null && var8.field1540 == arg0) {
                class317.method1938(arg1, var8, arg3, arg2, -6754);
                class75.method579(arg3, -17642, arg2, var8);
                if ((var8.field1543 - var8.field1568) < var8.field1665) {
                    var8.field1665 = var8.field1543 - var8.field1568;
                }
                if (var8.field1665 < 0) {
                    var8.field1665 = 0;
                }
                if ((var8.field1629 - var8.field1577) < var8.field1633) {
                    var8.field1633 = var8.field1629 - var8.field1577;
                }
                if (var8.field1633 < 0) {
                    var8.field1633 = 0;
                }
                if (var8.field1666 == 0) {
                    class6.method40(arg1, var8, false);
                }
            }
        }
        field1226++;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
    public static void method692(int arg0) {
        if (arg0 != 3) {
            method689(-79, (byte) 73);
        }
        field1227 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method693(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1220 = 35;
        }
        field1216++;
        if (this.field1220 == this.field1213) {
            this.field1228 = this.field1222[arg1] == null;
            this.field1222[arg1] = class279.field3802;
            return this.field1217[arg1];
        } else if (this.field1220 == 1) {
            this.field1228 = this.field1221 != arg1;
            this.field1221 = arg1;
            return this.field1217[0];
        } else {
            class412 var3 = this.field1222[arg1];
            if (var3 == null) {
                this.field1228 = true;
                if (this.field1220 > this.field1219) {
                    var3 = new class412(arg1, this.field1219);
                    this.field1219++;
                } else {
                    class412 var4 = (class412) this.field1215.method1163((byte) 33);
                    var3 = new class412(arg1, var4.field5732);
                    this.field1222[var4.field5736] = null;
                    var4.method1884(false);
                }
                this.field1222[arg1] = var3;
            } else {
                this.field1228 = false;
            }
            this.field1215.method1169(var3, !arg0);
            return this.field1217[var3.field5732];
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method694(byte arg0) {
        field1223++;
        if (this.field1220 != this.field1213) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == -8) {
            for (int var2 = 0; var2 < this.field1220; var2++) {
                this.field1222[var2] = class279.field3802;
            }
            return this.field1217;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(III)V")
    public class87(int arg0, int arg1, int arg2) {
        this.field1213 = arg1;
        this.field1220 = arg0;
        this.field1222 = new class412[this.field1213];
        this.field1217 = new int[this.field1220][3][arg2];
    }

    static {
        new class368("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field1227 = new class423[2048];
    }
}
