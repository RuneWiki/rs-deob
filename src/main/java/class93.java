import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class93 {

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "Lgg;")
    private class114 field1182 = new class114(64);

    @OriginalMember(owner = "client!naa", name = "l", descriptor = "Lgg;")
    private class114 field1188 = new class114(100);

    @OriginalMember(owner = "client!naa", name = "k", descriptor = "Lkha;")
    private class687 field1187;

    @OriginalMember(owner = "client!naa", name = "i", descriptor = "Z")
    public static volatile boolean field1185 = false;

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "Lmq;")
    public static class78 field1184 = new class78(48, 6);

    @OriginalMember(owner = "client!naa", name = "m", descriptor = "[[[I")
    public static int[][][] field1189 = new int[2][][];

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!naa", name = "j", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "[[[Lfu;")
    public static class73[][][] field1177;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(BI)Lkga;")
    public final class555 method637(byte arg0, int arg1) {
        field1179++;
        class114 var3 = this.field1188;
        synchronized (this.field1188) {
            class555 var4 = (class555) this.field1188.method778((long) arg1, 126);
            if (var4 == null) {
                var4 = new class555(arg1);
                this.field1188.method774((long) arg1, -97, var4);
            }
            if (arg0 > -122) {
                field1177 = null;
            }
            return var4.method3153(5206) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)V")
    public static void method638(byte arg0) {
        field1184 = null;
        if (arg0 >= -13) {
            field1177 = null;
        }
        field1189 = null;
        field1177 = null;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)V")
    public final void method639(int arg0, int arg1) {
        class114 var3 = this.field1182;
        synchronized (this.field1182) {
            this.field1182.method775(1, arg0);
        }
        field1186++;
        class114 var4 = this.field1188;
        synchronized (this.field1188) {
            int var5 = 60 % ((51 - arg1) / 39);
            this.field1188.method775(1, arg0);
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V")
    public final void method640(int arg0) {
        field1181++;
        if (arg0 != -1) {
            field1189 = null;
        }
        class114 var2 = this.field1182;
        synchronized (this.field1182) {
            this.field1182.method776((byte) 114);
        }
        class114 var3 = this.field1188;
        synchronized (this.field1188) {
            this.field1188.method776((byte) 120);
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I[Lgaa;B)V")
    public static final void method641(int arg0, class460[] arg1, byte arg2) {
        int var3 = -62 % ((arg2 + 4) / 41);
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class460 var5 = arg1[var4];
            if (var5 != null) {
                if (var5.field6483 == 0) {
                    if (var5.field6567 != null) {
                        method641(arg0, var5.field6567, (byte) 87);
                    }
                    class157 var6 = (class157) class148.field1802.method3248((long) var5.field6524, 0);
                    if (var6 != null) {
                        class677.method3641(arg0, var6.field2028, 31);
                    }
                }
                if (arg0 == 0 && var5.field6507 != null) {
                    class575 var7 = new class575();
                    var7.field8027 = var5.field6507;
                    var7.field8028 = var5;
                    class445.method2625(var7);
                }
                if (arg0 == 1 && var5.field6532 != null) {
                    if (var5.field6601 >= 0) {
                        class460 var8 = class102.method684(5025, var5.field6524);
                        if (var8 == null || var8.field6567 == null || var8.field6567.length <= var5.field6601 || var8.field6567[var5.field6601] != var5) {
                            continue;
                        }
                    }
                    class575 var9 = new class575();
                    var9.field8027 = var5.field6532;
                    var9.field8028 = var5;
                    class445.method2625(var9);
                }
            }
        }
        field1183++;
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(B)V")
    public final void method642(byte arg0) {
        field1180++;
        if (arg0 != 93) {
            field1177 = null;
        }
        class114 var2 = this.field1182;
        synchronized (this.field1182) {
            this.field1182.method781((byte) 47);
        }
        class114 var3 = this.field1188;
        synchronized (this.field1188) {
            this.field1188.method781((byte) 47);
        }
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(II)Lrj;")
    public final class747 method643(int arg0, int arg1) {
        field1178++;
        class114 var3 = this.field1182;
        class747 var4;
        synchronized (this.field1182) {
            var4 = (class747) this.field1182.method778((long) arg0, -65);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field1187;
        byte[] var6;
        synchronized (this.field1187) {
            var6 = this.field1187.method3810(class118.method790(arg0, (byte) -92), -23360, class704.method3906(arg0, 21544));
        }
        class747 var7 = new class747();
        if (arg1 >= -60) {
            return null;
        }
        var7.field10462 = this;
        var7.field10444 = arg0;
        if (var6 != null) {
            var7.method4177(new class179(var6), (byte) -13);
        }
        var7.method4179(false);
        class114 var8 = this.field1182;
        synchronized (this.field1182) {
            this.field1182.method774((long) arg0, -69, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Ldh;ILkha;Lkha;Lkha;)V")
    public class93(class286 arg0, int arg1, class687 arg2, class687 arg3, class687 arg4) {
        this.field1187 = arg2;
        if (this.field1187 != null) {
            int var6 = this.field1187.method3816(-126) - 1;
            this.field1187.method3812(0, var6);
        }
        class39.method333(arg4, 7986, arg3, 2);
    }
}
