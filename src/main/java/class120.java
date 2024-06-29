import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class120 {

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public int field2006 = 8;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public int field2010 = 16777215;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field2007 = 0;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2019 = "Loading textures - ";

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public int field2008;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public int field2016;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public int field2017;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "Z")
    public boolean field2014;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILab;II)V")
    private final void method903(int arg0, class249 arg1, int arg2, int arg3) {
        if (arg0 != 27393) {
            this.field2005 = -40;
        }
        if (arg2 == 1) {
            this.field2006 = arg1.method1821((byte) 51);
        } else if (arg2 == 2) {
            this.field2014 = true;
        } else if (arg2 == 3) {
            this.field2005 = arg1.method1762(-1);
            this.field2016 = arg1.method1762(-1);
            this.field2008 = arg1.method1762(-1);
        } else if (arg2 == 4) {
            this.field2017 = arg1.method1802((byte) -113);
        } else if (arg2 == 5) {
            this.field2009 = arg1.method1821((byte) 51);
        } else if (arg2 == 6) {
            this.field2010 = arg1.method1812((byte) 52);
        }
        field2012++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(CI)Z")
    public static final boolean method904(char arg0, int arg1) {
        field2004++;
        if (arg1 != 4157) {
            method904('R', -115);
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V")
    public static final void method905(boolean arg0) {
        field2015++;
        if (class70.field1165 == 0) {
            return;
        }
        try {
            if (++class299.field4879 > 2000) {
                if (class159.field2609 != null) {
                    class159.field2609.method1070(90);
                    class159.field2609 = null;
                }
                if (class273.field4566 >= 1) {
                    class70.field1165 = 0;
                    class10.field184 = -5;
                    return;
                }
                if (class264.field4408 == class146.field2411) {
                    class264.field4408 = class223.field3741;
                } else {
                    class264.field4408 = class146.field2411;
                }
                class273.field4566++;
                class299.field4879 = 0;
                class70.field1165 = 1;
            }
            if (class70.field1165 == 1) {
                class244.field4100 = class142.field2344.method572(class264.field4408, (byte) -111, class186.field2971);
                class70.field1165 = 2;
            }
            if (class70.field1165 == 2) {
                if (class244.field4100.field3091 == 2) {
                    throw new IOException();
                }
                if (class244.field4100.field3091 != 1) {
                    return;
                }
                class159.field2609 = new class144((Socket) class244.field4100.field3089, class142.field2344);
                class244.field4100 = null;
                class159.field2609.method1066(class236.field3980.field4182, -124, class236.field3980.field4160, 0);
                if (class95.field1543 != null) {
                    class95.field1543.method1715(2);
                }
                if (class272.field4546 != null) {
                    class272.field4546.method1715(2);
                }
                int var1 = class159.field2609.method1064(false);
                if (class95.field1543 != null) {
                    class95.field1543.method1715(2);
                }
                if (class272.field4546 != null) {
                    class272.field4546.method1715(2);
                }
                if (var1 != 21) {
                    class10.field184 = var1;
                    class70.field1165 = 0;
                    class159.field2609.method1070(126);
                    class159.field2609 = null;
                    return;
                }
                class70.field1165 = 3;
            }
            if (arg0) {
                if (class70.field1165 == 3) {
                    if (class159.field2609.method1065(-90) < 1) {
                        return;
                    }
                    class109.field1804 = new String[class159.field2609.method1064(false)];
                    class70.field1165 = 4;
                }
                if (class70.field1165 == 4 && class159.field2609.method1065(-121) >= (class109.field1804.length * 8)) {
                    class136.field2239.field4160 = 0;
                    class159.field2609.method1069(class109.field1804.length * 8, class136.field2239.field4182, 0, 6056);
                    for (int var2 = 0; var2 < class109.field1804.length; var2++) {
                        class109.field1804[var2] = class243.method1739((byte) 72, class136.field2239.method1810((byte) -38));
                    }
                    class10.field184 = 21;
                    class70.field1165 = 0;
                    class159.field2609.method1070(69);
                    class159.field2609 = null;
                }
            }
        } catch (IOException var3) {
            if (class159.field2609 != null) {
                class159.field2609.method1070(102);
                class159.field2609 = null;
            }
            if (class273.field4566 >= 1) {
                class70.field1165 = 0;
                class10.field184 = -4;
            } else {
                if (class264.field4408 == class146.field2411) {
                    class264.field4408 = class223.field3741;
                } else {
                    class264.field4408 = class146.field2411;
                }
                class299.field4879 = 0;
                class273.field4566++;
                class70.field1165 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V")
    public static final void method906(int arg0, byte arg1) {
        field2018++;
        if (arg1 != 89) {
            field2019 = null;
        }
        class36 var2 = class136.method1013(7, arg0, (byte) -90);
        var2.method221(1);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public static void method907(byte arg0) {
        field2019 = null;
        if (arg0 <= 61) {
            field2007 = 82;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lab;II)V")
    public final void method908(class249 arg0, int arg1, int arg2) {
        int var4 = 28 / ((arg1 - 21) / 49);
        field2011++;
        while (true) {
            int var5 = arg0.method1802((byte) 95);
            if (var5 == 0) {
                return;
            }
            this.method903(27393, arg0, var5, arg2);
        }
    }
}
