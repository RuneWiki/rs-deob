import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class103 {

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1245 = 0;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "[Ljj;")
    public static class170[] field1251 = new class170[14];

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public int field1242;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public int field1247;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[B")
    public byte[] field1241;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "[B")
    public byte[] field1246;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 8)
    public static void method497(byte arg0) {
        field1251 = null;
        if (arg0 != 74) {
            method498();
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()V", line = 20)
    public static final void method498() {
        class174.field2095 = 0;
        label191: for (int var0 = 0; var0 < class87.field1086; var0++) {
            class85 var1 = class334.field4806[var0];
            if (class329.field4733 != null) {
                for (int var2 = 0; var2 < class329.field4733.length; var2++) {
                    if (class329.field4733[var2] != -1000000 && (var1.field1036 <= class329.field4733[var2] || var1.field1025 <= class329.field4733[var2]) && (var1.field1047 <= class162.field1938[var2] || var1.field1027 <= class162.field1938[var2]) && (var1.field1047 >= class125.field1535[var2] || var1.field1027 >= class125.field1535[var2]) && (var1.field1041 <= class67.field843[var2] || var1.field1034 <= class67.field843[var2]) && (var1.field1041 >= class94.field1177[var2] || var1.field1034 >= class94.field1177[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field1040 == 1) {
                int var3 = var1.field1028 + class218.field3071 - class352.field5065;
                if (var3 >= 0 && var3 <= class218.field3071 + class218.field3071) {
                    int var4 = var1.field1037 + class218.field3071 - class25.field345;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1042 + class218.field3071 - class25.field345;
                    if (var5 > class218.field3071 + class218.field3071) {
                        var5 = class218.field3071 + class218.field3071;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class115.field1413[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class404.field5739 - var1.field1047;
                        if (var7 > class200.field2783) {
                            var1.field1038 = 1;
                        } else {
                            if (var7 >= -class200.field2783) {
                                continue;
                            }
                            var1.field1038 = 2;
                            var7 = -var7;
                        }
                        var1.field1044 = (var1.field1041 - class68.field851 << 8) / var7;
                        var1.field1029 = (var1.field1034 - class68.field851 << 8) / var7;
                        var1.field1032 = (var1.field1036 - class280.field4067 << 8) / var7;
                        var1.field1030 = (var1.field1025 - class280.field4067 << 8) / var7;
                        class388.field5563[class174.field2095++] = var1;
                    }
                }
            } else if (var1.field1040 == 2) {
                int var8 = var1.field1037 + class218.field3071 - class25.field345;
                if (var8 >= 0 && var8 <= class218.field3071 + class218.field3071) {
                    int var9 = var1.field1028 + class218.field3071 - class352.field5065;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1049 + class218.field3071 - class352.field5065;
                    if (var10 > class218.field3071 + class218.field3071) {
                        var10 = class218.field3071 + class218.field3071;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class115.field1413[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class68.field851 - var1.field1041;
                        if (var12 > class200.field2783) {
                            var1.field1038 = 3;
                        } else {
                            if (var12 >= -class200.field2783) {
                                continue;
                            }
                            var1.field1038 = 4;
                            var12 = -var12;
                        }
                        var1.field1035 = (var1.field1047 - class404.field5739 << 8) / var12;
                        var1.field1039 = (var1.field1027 - class404.field5739 << 8) / var12;
                        var1.field1032 = (var1.field1036 - class280.field4067 << 8) / var12;
                        var1.field1030 = (var1.field1025 - class280.field4067 << 8) / var12;
                        class388.field5563[class174.field2095++] = var1;
                    }
                }
            } else if (var1.field1040 == 4) {
                int var13 = var1.field1036 - class280.field4067;
                if (var13 > class200.field2779) {
                    int var14 = var1.field1037 + class218.field3071 - class25.field345;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1042 + class218.field3071 - class25.field345;
                    if (var15 > class218.field3071 + class218.field3071) {
                        var15 = class218.field3071 + class218.field3071;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1028 + class218.field3071 - class352.field5065;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1049 + class218.field3071 - class352.field5065;
                        if (var17 > class218.field3071 + class218.field3071) {
                            var17 = class218.field3071 + class218.field3071;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class115.field1413[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1038 = 5;
                            var1.field1035 = (var1.field1047 - class404.field5739 << 8) / var13;
                            var1.field1039 = (var1.field1027 - class404.field5739 << 8) / var13;
                            var1.field1044 = (var1.field1041 - class68.field851 << 8) / var13;
                            var1.field1029 = (var1.field1034 - class68.field851 << 8) / var13;
                            class388.field5563[class174.field2095++] = var1;
                        }
                    }
                }
            }
        }
    }
}
