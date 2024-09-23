import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CKDEJADD")
public class NpcType {

    @OriginalMember(owner = "CKDEJADD", name = "a", descriptor = "I")
    public int walkanim_l = -1;

    @OriginalMember(owner = "CKDEJADD", name = "c", descriptor = "I")
    public int multivarbit = -1;

    @OriginalMember(owner = "CKDEJADD", name = "d", descriptor = "I")
    public int walkanim_b = -1;

    @OriginalMember(owner = "CKDEJADD", name = "e", descriptor = "I")
    public int mutlivarp = -1;

    @OriginalMember(owner = "CKDEJADD", name = "g", descriptor = "I")
    public int vislevel = -1;

    @OriginalMember(owner = "CKDEJADD", name = "i", descriptor = "I")
    private int _flowObfuscator1 = 9;

    @OriginalMember(owner = "CKDEJADD", name = "j", descriptor = "I")
    private int _flowObfuscator2 = 1834;

    @OriginalMember(owner = "CKDEJADD", name = "m", descriptor = "I")
    public int walkanim = -1;

    @OriginalMember(owner = "CKDEJADD", name = "n", descriptor = "B")
    public byte size = 1;

    @OriginalMember(owner = "CKDEJADD", name = "o", descriptor = "I")
    private int _flowObfuscator3 = 9;

    @OriginalMember(owner = "CKDEJADD", name = "q", descriptor = "I")
    public int field50 = -1;

    @OriginalMember(owner = "CKDEJADD", name = "u", descriptor = "I")
    public int headicon = -1;

    @OriginalMember(owner = "CKDEJADD", name = "w", descriptor = "I")
    public int readyanim = -1;

    @OriginalMember(owner = "CKDEJADD", name = "x", descriptor = "J")
    public long type = -1L;

    @OriginalMember(owner = "CKDEJADD", name = "y", descriptor = "I")
    public int turnspeed = 32;

    @OriginalMember(owner = "CKDEJADD", name = "A", descriptor = "Z")
    private boolean _flowObfuscator5 = false;

    @OriginalMember(owner = "CKDEJADD", name = "C", descriptor = "I")
    public int walkanim_r = -1;

    @OriginalMember(owner = "CKDEJADD", name = "D", descriptor = "Z")
    public boolean active = true;

    @OriginalMember(owner = "CKDEJADD", name = "F", descriptor = "I")
    private int resizev = 128;

    @OriginalMember(owner = "CKDEJADD", name = "G", descriptor = "Z")
    public boolean minimap = true;

    @OriginalMember(owner = "CKDEJADD", name = "J", descriptor = "I")
    public int field69 = -1;

    @OriginalMember(owner = "CKDEJADD", name = "K", descriptor = "I")
    private int resizeh = 128;

    @OriginalMember(owner = "CKDEJADD", name = "M", descriptor = "Z")
    public boolean alwaysontop = false;

    @OriginalMember(owner = "CKDEJADD", name = "P", descriptor = "I")
    public int field75 = -1;

    @OriginalMember(owner = "CKDEJADD", name = "t", descriptor = "I")
    private static int _flowObfuscator4 = 748;

    @OriginalMember(owner = "CKDEJADD", name = "O", descriptor = "LGCPOSBWX;")
    public static LruCache modelCacheStatic = new LruCache(false, 30);

    @OriginalMember(owner = "CKDEJADD", name = "E", descriptor = "I")
    private int ambient;

    @OriginalMember(owner = "CKDEJADD", name = "b", descriptor = "I")
    private static int cachePos;

    @OriginalMember(owner = "CKDEJADD", name = "L", descriptor = "I")
    private int contrast;

    @OriginalMember(owner = "CKDEJADD", name = "h", descriptor = "I")
    public static int count;

    @OriginalMember(owner = "CKDEJADD", name = "f", descriptor = "LMBMGIXGO;")
    private static Packet dat;

    @OriginalMember(owner = "CKDEJADD", name = "B", descriptor = "Lclient;")
    public static client varProvider;

    @OriginalMember(owner = "CKDEJADD", name = "k", descriptor = "Ljava/lang/String;")
    public String name;

    @OriginalMember(owner = "CKDEJADD", name = "I", descriptor = "[B")
    public byte[] desc;

    @OriginalMember(owner = "CKDEJADD", name = "s", descriptor = "[I")
    private int[] heads;

    @OriginalMember(owner = "CKDEJADD", name = "r", descriptor = "[I")
    private static int[] idx;

    @OriginalMember(owner = "CKDEJADD", name = "N", descriptor = "[I")
    private int[] models;

    @OriginalMember(owner = "CKDEJADD", name = "H", descriptor = "[I")
    public int[] multinpc;

    @OriginalMember(owner = "CKDEJADD", name = "p", descriptor = "[I")
    private int[] recol_d;

    @OriginalMember(owner = "CKDEJADD", name = "v", descriptor = "[I")
    private int[] recol_s;

    @OriginalMember(owner = "CKDEJADD", name = "z", descriptor = "[LCKDEJADD;")
    private static NpcType[] cache;

    @OriginalMember(owner = "CKDEJADD", name = "l", descriptor = "[Ljava/lang/String;")
    public String[] op;

    @OriginalMember(owner = "CKDEJADD", name = "a", descriptor = "(I)LCKDEJADD;")
    public static final NpcType get(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == cache[var1].type) {
                return cache[var1];
            }
        }
        cachePos = (cachePos + 1) % 20;
        NpcType var2 = cache[cachePos] = new NpcType();
        dat.pos = idx[arg0];
        var2.type = arg0;
        var2.decodeClient(true, dat);
        return var2;
    }

    @OriginalMember(owner = "CKDEJADD", name = "a", descriptor = "(Z)LZKARKDQW;")
    public final Model getHeadModel(boolean arg0) {
        if (this.multinpc != null) {
            NpcType var2 = this.getMultiNpc(this._flowObfuscator2);
            return var2 == null ? null : var2.getHeadModel(true);
        } else if (this.heads == null) {
            return null;
        } else {
            boolean var3 = false;
            if (!arg0) {
                this._flowObfuscator2 = 303;
            }
            for (int var4 = 0; var4 < this.heads.length; var4++) {
                if (!Model.validate(this.heads[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            Model[] var5 = new Model[this.heads.length];
            for (int var6 = 0; var6 < this.heads.length; var6++) {
                var5[var6] = Model.tryGet(this._flowObfuscator3, this.heads[var6]);
            }
            Model var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new Model(var5.length, var5, -38);
            }
            if (this.recol_s != null) {
                for (int var8 = 0; var8 < this.recol_s.length; var8++) {
                    var7.recolour(this.recol_s[var8], this.recol_d[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "CKDEJADD", name = "b", descriptor = "(I)LCKDEJADD;")
    public final NpcType getMultiNpc(int arg0) {
        int var2 = -1;
        if (arg0 != 1834) {
            this._flowObfuscator5 = !this._flowObfuscator5;
        }
        if (this.multivarbit != -1) {
            VarbitType var3 = VarbitType.instances[this.multivarbit];
            int var4 = var3.basevar;
            int var5 = var3.startbit;
            int var6 = var3.endbit;
            int var7 = client.BITMASK[var6 - var5];
            var2 = varProvider.varps[var4] >> var5 & var7;
        } else if (this.mutlivarp != -1) {
            var2 = varProvider.varps[this.mutlivarp];
        }
        return var2 < 0 || var2 >= this.multinpc.length || this.multinpc[var2] == -1 ? null : get(this.multinpc[var2]);
    }

    @OriginalMember(owner = "CKDEJADD", name = "a", descriptor = "(LXTGLDHGX;)V")
    public static final void unpack(Jagfile arg0) {
        dat = new Packet(arg0.read("npc.dat", null), 891);
        Packet var1 = new Packet(arg0.read("npc.idx", null), 891);
        count = var1.g2();
        idx = new int[count];
        int var2 = 2;
        for (int var3 = 0; var3 < count; var3++) {
            idx[var3] = var2;
            var2 += var1.g2();
        }
        cache = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            cache[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "CKDEJADD", name = "c", descriptor = "(I)V")
    public static final void unload(int arg0) {
        modelCacheStatic = null;
        idx = null;
        if (arg0 >= 0) {
            _flowObfuscator4 = 60;
        }
        cache = null;
        dat = null;
    }

    @OriginalMember(owner = "CKDEJADD", name = "a", descriptor = "(III[I)LZKARKDQW;")
    public final Model getModel(int arg0, int arg1, int arg2, int[] arg3) {
        if (this.multinpc != null) {
            NpcType var5 = this.getMultiNpc(this._flowObfuscator2);
            return var5 == null ? null : var5.getModel(0, arg1, arg2, arg3);
        }
        Model var6 = (Model) modelCacheStatic.get(this.type);
        if (arg0 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var6 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.models.length; var9++) {
                if (!Model.validate(this.models[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            Model[] var10 = new Model[this.models.length];
            for (int var11 = 0; var11 < this.models.length; var11++) {
                var10[var11] = Model.tryGet(this._flowObfuscator3, this.models[var11]);
            }
            if (var10.length == 1) {
                var6 = var10[0];
            } else {
                var6 = new Model(var10.length, var10, -38);
            }
            if (this.recol_s != null) {
                for (int var12 = 0; var12 < this.recol_s.length; var12++) {
                    var6.recolour(this.recol_s[var12], this.recol_d[var12]);
                }
            }
            var6.createLabelReferences((byte) -71);
            var6.calculateNormals(this.ambient + 64, this.contrast + 850, -30, -50, -30, true);
            modelCacheStatic.put(var6, this.type, (byte) 2);
        }
        Model var13 = Model.empty;
        var13.set(7, var6, AnimFrame.isNull(arg2, false) & AnimFrame.isNull(arg1, false));
        if (arg2 != -1 && arg1 != -1) {
            var13.applyTransforms(-20491, arg3, arg1, arg2);
        } else if (arg2 != -1) {
            var13.applyTransform(arg2, 40542);
        }
        if (this.resizeh != 128 || this.resizev != 128) {
            var13.scale(this.resizeh, this.resizeh, this._flowObfuscator1, this.resizev);
        }
        var13.calculateBoundsCylinder(false);
        var13.labelFaces = null;
        var13.labelVertices = null;
        if (this.size == 1) {
            var13.picking = true;
        }
        return var13;
    }

    @OriginalMember(owner = "CKDEJADD", name = "a", descriptor = "(ZLMBMGIXGO;)V")
    private final void decodeClient(boolean arg0, Packet arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.g1();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.g1();
                    this.models = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.models[var5] = arg1.g2();
                    }
                } else if (var3 == 2) {
                    this.name = arg1.gjstr();
                } else if (var3 == 3) {
                    this.desc = arg1.gjstrraw((byte) 30);
                } else if (var3 == 12) {
                    this.size = arg1.g1b();
                } else if (var3 == 13) {
                    this.readyanim = arg1.g2();
                } else if (var3 == 14) {
                    this.walkanim = arg1.g2();
                } else if (var3 == 17) {
                    this.walkanim = arg1.g2();
                    this.walkanim_b = arg1.g2();
                    this.walkanim_r = arg1.g2();
                    this.walkanim_l = arg1.g2();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.op == null) {
                        this.op = new String[5];
                    }
                    this.op[var3 - 30] = arg1.gjstr();
                    if (this.op[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.op[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.g1();
                    this.recol_s = new int[var6];
                    this.recol_d = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.recol_s[var7] = arg1.g2();
                        this.recol_d[var7] = arg1.g2();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.g1();
                    this.heads = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.heads[var9] = arg1.g2();
                    }
                } else if (var3 == 90) {
                    this.field75 = arg1.g2();
                } else if (var3 == 91) {
                    this.field50 = arg1.g2();
                } else if (var3 == 92) {
                    this.field69 = arg1.g2();
                } else if (var3 == 93) {
                    this.minimap = false;
                } else if (var3 == 95) {
                    this.vislevel = arg1.g2();
                } else if (var3 == 97) {
                    this.resizeh = arg1.g2();
                } else if (var3 == 98) {
                    this.resizev = arg1.g2();
                } else if (var3 == 99) {
                    this.alwaysontop = true;
                } else if (var3 == 100) {
                    this.ambient = arg1.g1b();
                } else if (var3 == 101) {
                    this.contrast = arg1.g1b() * 5;
                } else if (var3 == 102) {
                    this.headicon = arg1.g2();
                } else if (var3 == 103) {
                    this.turnspeed = arg1.g2();
                } else if (var3 == 106) {
                    this.multivarbit = arg1.g2();
                    if (this.multivarbit == 65535) {
                        this.multivarbit = -1;
                    }
                    this.mutlivarp = arg1.g2();
                    if (this.mutlivarp == 65535) {
                        this.mutlivarp = -1;
                    }
                    int var10 = arg1.g1();
                    this.multinpc = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.multinpc[var11] = arg1.g2();
                        if (this.multinpc[var11] == 65535) {
                            this.multinpc[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.active = false;
                }
            }
        }
    }
}
