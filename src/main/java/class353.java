import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class353 implements class95 {

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "Z")
    public static boolean field5142 = true;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "Lbn;")
    public static class160 field5152;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "Ljn;")
    public static class409 field5153;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public int field5140;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public int field5144;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    public int field5148;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public int field5150;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public int field5151;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    public int field5154;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "Z")
    public boolean field5147;

    static {
        new class409("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field5152 = new class160(28, 3);
        field5153 = new class409(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V", line = 3)
    public static void method2258(int arg0) {
        if (arg0 != -1575687800) {
            method2260(false, (String) null);
        }
        field5153 = null;
        field5152 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)J", line = 14)
    public final long method638(byte arg0) {
        field5141++;
        long[] var2 = class186.field2606;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field5150 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field5154 >> 8)) & 0xFFL)];
        long var9 = var2[(int) (((long) this.field5154 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) (((long) (this.field5148 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) ((var11 ^ (long) (this.field5148 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field5148 >> 8) ^ var13) & 0xFFL)];
        long var17 = var2[(int) ((var15 ^ (long) this.field5148) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field5151) & 0xFFL)];
        if (arg0 <= 56) {
            method2261('$', (byte) 37);
        }
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field5144 >> 24)) & 0xFFL)];
        long var23 = var2[(int) ((var21 ^ (long) (this.field5144 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field5144 >> 8)) & 0xFFL)];
        long var27 = var25 >>> 8 ^ var2[(int) ((var25 ^ (long) this.field5144) & 0xFFL)];
        long var29 = var2[(int) (((long) this.field5140 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field5147 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLur;)Z", line = 44)
    public final boolean method639(byte arg0, class95 arg1) {
        field5145++;
        if (!(arg1 instanceof class353)) {
            return false;
        }
        if (arg0 >= -9) {
            this.method638((byte) -70);
        }
        class353 var3 = (class353) arg1;
        if (this.field5150 != var3.field5150) {
            return false;
        } else if (this.field5154 != var3.field5154) {
            return false;
        } else if (this.field5148 != var3.field5148) {
            return false;
        } else if (this.field5151 != var3.field5151) {
            return false;
        } else if (this.field5144 != var3.field5144) {
            return false;
        } else if (this.field5140 == var3.field5140) {
            return this.field5147 == var3.field5147;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([Ljava/lang/Object;[JI)V", line = 92)
    public static final void method2259(Object[] arg0, long[] arg1, int arg2) {
        class96.method640(arg1, 4, arg0, 0, arg1.length - 1);
        if (arg2 > 89) {
            field5149++;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 104)
    public static final boolean method2260(boolean arg0, String arg1) {
        if (!arg0) {
            field5152 = null;
        }
        field5146++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class373.field5450; var2++) {
            if (arg1.equalsIgnoreCase(class271.field4015[var2])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class187.field2619.field5587);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(CB)Z", line = 152)
    public static final boolean method2261(char arg0, byte arg1) {
        if (arg1 != 109) {
            method2258(-127);
        }
        field5143++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class210.field2961;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }
}
