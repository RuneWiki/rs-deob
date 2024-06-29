import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class479 extends class213 {
   @OriginalMember(
      owner = "client!uda",
      name = "M",
      descriptor = "I"
   )
   private int field6621 = 1024;
   @OriginalMember(
      owner = "client!uda",
      name = "D",
      descriptor = "I"
   )
   private int field6612 = 1024;
   @OriginalMember(
      owner = "client!uda",
      name = "V",
      descriptor = "I"
   )
   private int field6622 = 819;
   @OriginalMember(
      owner = "client!uda",
      name = "R",
      descriptor = "I"
   )
   private int field6619 = 0;
   @OriginalMember(
      owner = "client!uda",
      name = "F",
      descriptor = "I"
   )
   private int field6623 = 2048;
   @OriginalMember(
      owner = "client!uda",
      name = "X",
      descriptor = "I"
   )
   private int field6620 = 0;
   @OriginalMember(
      owner = "client!uda",
      name = "U",
      descriptor = "I"
   )
   private int field6618 = 1024;
   @OriginalMember(
      owner = "client!uda",
      name = "I",
      descriptor = "I"
   )
   private int field6626 = 1024;
   @OriginalMember(
      owner = "client!uda",
      name = "T",
      descriptor = "I"
   )
   private int field6628 = 409;
   @OriginalMember(
      owner = "client!uda",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6630 = new String[]{method3496(method3495("mwgb\u007f0")), method3496(method3495("vfj ")), method3496(method3495("c=(bE")), method3496(method3495("mwgbz0")), method3496(method3495("mwgb{0")), method3496(method3495("mwgby0")), method3496(method3495("mwgb}0")), method3496(method3495("mwgbs0")), method3496(method3495("yfr#Owaj(")), method3496(method3495("~cu#V")), method3496(method3495("o~7l^yzj)\\")), method3496(method3495("^|t/]|3r;]}}o\"_8wo?Yz\u007fc(\u0016")), method3496(method3495("^|t/]|3r;]}}o\"_8VH\rzTVBm")), method3496(method3495("kvr#Mlcs8\u0018")), method3496(method3495("Wpe Kq|hlVwd&#^~2")), method3496(method3495("war$Wb|i!\u0018")), method3496(method3495("\\|h)")), method3496(method3495("pzb)[w\u007fk-H")), method3496(method3495("{`4(]zfav\u00180")), method3496(method3495("jvd9Qtwv>W~zj)")), method3496(method3495("^ro ]|3r#\u0018}}g.T}3d Ww~")), method3496(method3495("Kju8]u3k)Uwa\u007fv\u0018")), method3496(method3495("Nvtv\u0018")), method3496(method3495("{`v>W~zj)[tvg>")), method3496(method3495("{\u007fo<[w~v#V}}r?\u0005")), method3496(method3495("{\u007fo)Vlwt#H")), method3496(method3495("lx7")), method3496(method3495("[rh\"Wl3q>Qlv&8W8")), method3496(method3495("k|s\"\\kgt)Yupi9Vl")), method3496(method3495("\\vp%[})&")), method3496(method3495("mwgb~0")), method3496(method3495("^ro ]|3r#\u0018}}r)J8gm~")), method3496(method3495("^CUv\u0018")), method3496(method3495("{|k!Yvwul\u00158Gn%K8pi!Uy}b")), method3496(method3495("~zj)\u0018y\u007ft)Y|j&)@q`r?\u0019")), method3496(method3495("{`v>W~zj)Wmgv9L{")), method3496(method3495("jvh(]jvtl\u00158Ct%Vl3a>Yh{o/K8ac\"\\}ac>\u0018q}`#Jurr%Wv")), method3496(method3495("war$W{rk W{x")), method3496(method3495("K{o*L5pj%[s3b%Kyqj)\\6")), method3496(method3495("Q;ke\u00028")), method3496(method3495("pvg<\u001853V>Qvg&&Ynr&!]u|t5\u0018q}`#Jurr%Wv")), method3496(method3495("__^lLw|j'Ql)&l")), method3496(method3495("up")), method3496(method3495("{`v>W~zj)Wmgv9Ll")), method3496(method3495("k{i;Hj|`%Tq}aq")), method3496(method3495("^ro ]|3r#\u0018jvg(\u0018~zj)")), method3496(method3495("[|k<T}gcb\u0018L|i Sqg&\"Wo)&")), method3496(method3495("{`4(]zfav")), method3496(method3495("`)")), method3496(method3495("\u007fvr/Tqvh8Nyav")), method3496(method3495("v|h<[k")), method3496(method3495("]}r)J}w&8S-")), method3496(method3495("Kjh8Y`)&#Jl{il\u0004v-")), method3496(method3495("Lv~8\u0018{|i>\\k3e ]yac(")), method3496(method3495("{\u007fo)Vlyuy\\j|v")), method3496(method3495("{\u007fi?]wfr<Ml")), method3496(method3495("o~7")), method3496(method3495("Nvt?Qw}<l")), method3496(method3495("uvkq")), method3496(method3495("\u007fvr/_{|i>\\")), method3496(method3495("o~4")), method3496(method3495("kdo8[pdi>T|")), method3496(method3495("jfh?[jzv8\u0018")), method3496(method3495("~cul")), method3496(method3495("6\u007fi+")), method3496(method3495("k{o*L{\u007fo/S")), method3496(method3495("Nvh(Wj)&")), method3496(method3495("\u007fvr/Yuvt-Hw`")), method3496(method3495("vrr%N}~c!]jai>")), method3496(method3495("o~4l^yzj)\\")), method3496(method3495("{re$]kcg/]")), method3496(method3495("\\ai<H}w&/Tqvh8\u0018{|h\"]{go#V")), method3496(method3495("pvj<")), method3496(method3495("o)&")), method3496(method3495("v|h<[k.")), method3496(method3495("^ro ]|3r#\u0018}}r)J8gm}")), method3496(method3495("o!b)Zmt")), method3496(method3495("{|k!Yvwu")), method3496(method3495("o~4lKmpe)]|vb")), method3496(method3495("hai*Qtve<M")), method3496(method3495("Q}p-Tqw&.Mq\u007fb-J}r&:Ytfc")), method3496(method3495("|zt)[l\u007fi+Qv")), method3496(method3495("war$W8")), method3496(method3495("yfr#\u0018o|t \\8`c ]{gc(")), method3496(method3495("Uzh%Uyc&>]kvr")), method3496(method3495("^CUlWv")), method3496(method3495("\u007fvr;Wj\u007fb")), method3496(method3495("jvh(]jvt")), method3496(method3495("Pvo+Pl)&")), method3496(method3495("V|&?M{{&*Qtv")), method3496(method3495("Jvh(]j3e#J}`&\"Wo)&")), method3496(method3495("[)Z\u0018]ucZ$]yc((Muc")), method3496(method3495("irY#HGgc?L%")), method3496(method3495("8i<")), method3496(method3495("kju8]u~c!")), method3496(method3495("}at#Jlvu8")), method3496(method3495("}}g.T}3i>Lp|&!W|v&*Qj`rl\u0010m`cl\u001fwar$W8/hr\u001f1")), method3496(method3495("jvu)L{re$]")), method3496(method3495("\u007fp")), method3496(method3495("{|k<Y{g")), method3496(method3495("]}r)J}w&8S+")), method3496(method3495("jvu)Luzh%Uyc")), method3496(method3495("~cul\\}qs+\u0018|zu-Ztvb")), method3496(method3495("[|s \\8}i8\u0018{ac-L}3")), method3496(method3495("krp)Nyae?")), method3496(method3495("{\u007fo<[w~v#V}}r?")), method3496(method3495("kdo8[pvb")), method3496(method3495("]}r)J}w&8S)")), method3496(method3495("Tzd>Yjzc?\u0018m}j#Y|vb")), method3496(method3495("war$W8pg!]jr& W{x&%K8")), method3496(method3495("Hvt*Wj~g\"[})&")), method3496(method3495("jc")), method3496(method3495("Ypr%N}3u8J}rk?\u00028")), method3496(method3495("war$Wlzj)Kqicl")), method3496(method3495("8[c%_pg<l")), method3496(method3495("]}r)J}w&8S*")), method3496(method3495("^ro ]|3r#\u0018{{g\"_}3i>Lp|&!W|v")), method3496(method3495("W;ue\u00028")), method3496(method3495("jve8g|vd9_")), method3496(method3495("[re$]k3t)K}g")), method3496(method3495("wu`")), method3496(method3495("^ro ]|3r#\u0018}}r)J8gm|")), method3496(method3495("nrt<Zqg;")), method3496(method3495("{\u007fu")), method3496(method3495("T|i'\u00028")), method3496(method3495("hvt*Wj~g\"[}gc?L")), method3496(method3495("\u007fvr/Tqvh8Nyav.Ql")), method3496(method3495("nrt<\u0005")), method3496(method3495("lv~?Qbv")), method3496(method3495("hvt!\u0018nrt/K8`g:]|")), method3496(method3495("Z\u007fi#U8vh-Ztvb")), method3496(method3495("\\ao:]j3P)Jkzi\"\u00028")), method3496(method3495("hao\"L~cu")), method3496(method3495("Q}p-Tqw&>]{gY(]zfalNy\u007fs)")), method3496(method3495("^ro ]|3r#\u0018}}r)J8gm\u007f")), method3496(method3495("war$W8go ]8`o6]%")), method3496(method3495("w`")), method3496(method3495("j|r-L}pi\"V}pr!]l{i(K")), method3496(method3495("vrr%N};K\u001cj")), method3496(method3495("__&8Ww\u007fm%L\"3&l")), method3496(method3495("lx3")), method3496(method3495("H|uv\u0018")), method3496(method3495("\u007fvr$]qtn8")), method3496(method3495("jvd9Qtw")), method3496(method3495("Yae$\u00028")), method3496(method3495("[ft>]vg&8Ww\u007fm%L8wi)Kv4rlKmcv#Jl3k9Tlzv ]8pi>]k")), method3496(method3495("Tzd>Yjj&9Vt|g(Qvt&*Yq\u007fc(\u0019")), method3496(method3495("~cul\\}qs+\u0018}}g.T}w")), method3496(method3495("lx4")), method3496(method3495("^ro ]|3r#\u0018}}r)J8gmy")), method3496(method3495("K{o*L5pj%[s3C\u0002yZ_C\b\u0019")), method3496(method3495("Wpe Kq|hlVwd&#V9")), method3496(method3495("jve8g|vd9_%")), method3496(method3495("L|a+T}w'")), method3496(method3495("\\ BlLw|j'Ql)&l")), method3496(method3495("kvt:]jyuy\\j|v")), method3496(method3495("}at#Juvu?Y\u007fv")), method3496(method3495("w}")), method3496(method3495("pvg<")), method3496(method3495("{\u007fc-Jlv~8")), method3496(method3495("J|r-L}w&/Wv}c/Lq|hlU}gn#\\k")), method3496(method3495("pvg<\\m~v")), method3496(method3495("o~5lKmpe)]|vb")), method3496(method3495("^CUlW~u")), method3496(method3495("{|j!Yh3o?\u0018pzb(]v")), method3496(method3495("hp")), method3496(method3495("yfr#K}gs<")), method3496(method3495("ozh")), method3496(method3495("k{i;[w\u007fk-H")), method3496(method3495("o~5")), method3496(method3495("hvt!\u0018nrt/K8`e>Yuqj)\\")), method3496(method3495("Q;ue\u00028")), method3496(method3495("Jvd9Qtwo\"_8~g<\u00180do8P8ct#^q\u007fo\"_1")), method3496(method3495("zac-S{|h")), method3496(method3495("Uvk#Ja3d)^wacl[tvg\"Mh.")), method3496(method3495("~cu#^~")), method3496(method3495("\\ai<H}w&?]jec>\u0018r`3lV}g&=M}fc")), method3496(method3495("m}j#Y|}g8Qnvu")), method3496(method3495("7gk<\u0017pvg<\u0016|fk<")), method3496(method3495("wpe M|v")), method3496(method3495("]}r)J}w&8S(")), method3496(method3495("Kfe/]k``9Ttj&/Py}a)\\8|t8Pw3k#\\}")), method3496(method3495("kvr.Y")), method3496(method3495("Pvg<\u00028")), method3496(method3495("Uq")), method3496(method3495("UQ")), method3496(method3495("Zac-Sq}alV}d&/Wv}c/Lq|h?\u0018~|tl\r8`c/Wvwu")), method3496(method3495("k}j#_q}&")), method3496(method3495("ldc)V")), method3496(method3495("|zu<Tyj`<K8>&\u0018W\u007ftj)\u0018^CUlYvw&#LpvtlQvui>Uygo#V")), method3496(method3495("b|i!\u0018")), method3496(method3495("war$Wb|i!\u0005")), method3496(method3495("K@ClLw|j'Ql)&l")), method3496(method3495("ur~.Mq\u007fb-J}r;")), method3496(method3495("\\ai<H}w&/Tqvh8\u0018r`3lV}g&=M}fc")), method3496(method3495("Rrp-\u0018l|i Sqg<l")), method3496(method3495("u`")), method3496(method3495("Vrk)\u00028")), method3496(method3495("{\u007ful\u00158Pj)Yj3e#Vk|j)")), method3496(method3495("Z\u007fi#U8wo?Yz\u007fc(")), method3496(method3495("Uvk#Ja3g*L}a&/T}rh9H%")), method3496(method3495("z\u007fi#U")), method3496(method3495("jvh(]jct#^q\u007fc")), method3496(method3495("o~5l^yzj)\\")), method3496(method3495("irY#HGgc?L")), method3496(method3495("{|j!Yh3o?\u0018k{i;V")), method3496(method3495("Jvd9Qtwo\"_8~g<")), method3496(method3495("lx6")), method3496(method3495("kpt-Uz\u007fc:Yjpu")), method3496(method3495("|zu<Tyj`<K")), method3496(method3495("o~7lKmpe)]|vb")), method3496(method3495("{`4(]zfa")), method3496(method3495("lx5")), method3496(method3495("mwgb|0"))};
   @OriginalMember(
      owner = "client!uda",
      name = "W",
      descriptor = "I"
   )
   public static int field6610 = 0;
   @OriginalMember(
      owner = "client!uda",
      name = "L",
      descriptor = "I"
   )
   public static int field6611;
   @OriginalMember(
      owner = "client!uda",
      name = "K",
      descriptor = "I"
   )
   public static int field6613;
   @OriginalMember(
      owner = "client!uda",
      name = "O",
      descriptor = "I"
   )
   public static int field6614;
   @OriginalMember(
      owner = "client!uda",
      name = "S",
      descriptor = "I"
   )
   public static int field6615;
   @OriginalMember(
      owner = "client!uda",
      name = "N",
      descriptor = "I"
   )
   private int field6616;
   @OriginalMember(
      owner = "client!uda",
      name = "E",
      descriptor = "I"
   )
   public static int field6617;
   @OriginalMember(
      owner = "client!uda",
      name = "J",
      descriptor = "I"
   )
   public static int field6624;
   @OriginalMember(
      owner = "client!uda",
      name = "Q",
      descriptor = "I"
   )
   public static int field6625;
   @OriginalMember(
      owner = "client!uda",
      name = "H",
      descriptor = "I"
   )
   public static int field6627;
   @OriginalMember(
      owner = "client!uda",
      name = "P",
      descriptor = "I"
   )
   public static int field6629;

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method3490(int arg0, String arg1) {
      boolean var2 = client.field4273;

      try {
         ++field6617;
         if (arg1 != null) {
            if ((class209.field2582 < 200 || class530.field7265) && ~class209.field2582 > -201) {
               String var3 = class14.method110(true, arg1);
               if (var3 != null) {
                  byte var10000;
                  label98: {
                     int var4 = 0;
                     if (var2) {
                        var10000 = 1;
                     } else if (var4 >= class209.field2582) {
                        var10000 = 0;
                        if (!var2) {
                           break label98;
                        }
                     } else {
                        var10000 = 1;
                     }

                     while(true) {
                        String var5 = class14.method110((boolean)var10000, class125.field1560[var4]);
                        if (var5 != null && var5.equals(var3)) {
                           class545.method3938(-7764, 4, arg1 + class551.field7559.method3980(class494.field6787, true));
                           return;
                        }

                        if (class257.field3286[var4] != null) {
                           String var6 = class14.method110(true, class257.field3286[var4]);
                           if (var6 != null && var6.equals(var3)) {
                              class545.method3938(-7764, 4, arg1 + class551.field7559.method3980(class494.field6787, true));
                              return;
                           }
                        }

                        ++var4;
                        if (var4 >= class209.field2582) {
                           var10000 = 0;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var10000 = 1;
                        }
                     }
                  }

                  int var7 = var10000;
                  class223 var10;
                  class471 var11;
                  boolean var14;
                  if (var2) {
                     var14 = true;
                  } else if (var7 >= class568.field7743) {
                     var14 = class14.method110(true, class278.field3709.field5662).equals(var3);
                     if (!var2) {
                        if (var14) {
                           class545.method3938(arg0 ^ -7770, 4, class551.field7562.method3980(class494.field6787, true));
                           return;
                        }

                        if (arg0 != 10) {
                           return;
                        }

                        ++class316.field4219;
                        var10 = class355.method2790(13111);
                        var11 = class133.method1118(var10.field2787, 2, class369.field5195);
                        var11.field6527.method4318(class190.method1432(10524, arg1), arg0 + -10);
                        var11.field6527.method4332((byte)-117, arg1);
                        var10.method1702((byte)-65, var11);
                        return;
                     }
                  } else {
                     var14 = true;
                  }

                  while(true) {
                     String var8 = class14.method110(var14, class589.field8125[var7]);
                     if (var8 != null && var8.equals(var3)) {
                        class545.method3938(-7764, 4, class551.field7564.method3980(class494.field6787, true) + arg1 + class551.field7565.method3980(class494.field6787, true));
                        return;
                     }

                     if (class740.field10787[var7] != null) {
                        String var9 = class14.method110(true, class740.field10787[var7]);
                        if (var9 != null && var9.equals(var3)) {
                           class545.method3938(-7764, 4, class551.field7564.method3980(class494.field6787, true) + arg1 + class551.field7565.method3980(class494.field6787, true));
                           return;
                        }
                     }

                     ++var7;
                     if (var7 >= class568.field7743) {
                        var14 = class14.method110(true, class278.field3709.field5662).equals(var3);
                        if (!var2) {
                           if (var14) {
                              class545.method3938(arg0 ^ -7770, 4, class551.field7562.method3980(class494.field6787, true));
                              return;
                           }

                           if (arg0 != 10) {
                              return;
                           }

                           ++class316.field4219;
                           var10 = class355.method2790(13111);
                           var11 = class133.method1118(var10.field2787, 2, class369.field5195);
                           var11.field6527.method4318(class190.method1432(10524, arg1), arg0 + -10);
                           var11.field6527.method4332((byte)-117, arg1);
                           var10.method1702((byte)-65, var11);
                           return;
                        }
                     } else {
                        var14 = true;
                     }
                  }
               }
            } else {
               class545.method3938(arg0 ^ -7770, 4, class551.field7532.method3980(class494.field6787, true));
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field6630[4] + arg0 + ',' + (arg1 != null ? field6630[2] : field6630[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label96: {
            label95: {
               label94: {
                  label93: {
                     label92: {
                        label91: {
                           label90: {
                              label89: {
                                 label88: {
                                    ++field6615;
                                    if (arg2 != 0) {
                                       if (arg2 == 1) {
                                          break label88;
                                       }

                                       if (arg2 == 2) {
                                          break label89;
                                       }

                                       if (arg2 == 3) {
                                          break label90;
                                       }

                                       if (arg2 == 4) {
                                          break label91;
                                       }

                                       if (~arg2 == -6) {
                                          break label92;
                                       }

                                       if (arg2 == 6) {
                                          break label93;
                                       }

                                       if (~arg2 == -8) {
                                          break label94;
                                       }

                                       if (arg2 != 8) {
                                          break label96;
                                       }

                                       if (!var4) {
                                          break label95;
                                       }
                                    }

                                    this.field6620 = arg0.method4288((byte)104);
                                    if (!var4) {
                                       break label96;
                                    }
                                 }

                                 this.field6612 = arg0.method4280(-19104);
                                 if (!var4) {
                                    break label96;
                                 }
                              }

                              this.field6623 = arg0.method4280(-19104);
                              if (!var4) {
                                 break label96;
                              }
                           }

                           this.field6628 = arg0.method4280(-19104);
                           if (!var4) {
                              break label96;
                           }
                        }

                        this.field6622 = arg0.method4280(-19104);
                        if (!var4) {
                           break label96;
                        }
                     }

                     this.field6621 = arg0.method4280(-19104);
                     if (!var4) {
                        break label96;
                     }
                  }

                  this.field6619 = arg0.method4288((byte)120);
                  if (!var4) {
                     break label96;
                  }
               }

               this.field6626 = arg0.method4280(-19104);
               if (!var4) {
                  break label96;
               }
            }

            this.field6618 = arg0.method4280(-19104);
         }

         int var6 = 70 / ((68 - arg1) / 48);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field6630[0] + (arg0 != null ? field6630[2] : field6630[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field6613;
         if (arg1 != 2064866508) {
            return null;
         } else {
            int[] var4 = super.field2650.method3769(arg0, -4);
            if (super.field2650.field7140) {
               int[][] var5 = super.field2650.method3772(0);
               int var6 = 0;
               int var7 = 0;
               int var8 = 0;
               int var9 = 0;
               int var10 = 0;
               boolean var11 = true;
               byte var12 = 1;
               int var13 = 0;
               int var14 = 0;
               int var15 = class576.field7916 * this.field6612 >> 12;
               int var16 = class576.field7916 * this.field6623 >> 12;
               int var17 = class392.field5515 * this.field6628 >> 12;
               int var18 = class392.field5515 * this.field6622 >> 12;
               if (var18 <= 1) {
                  return var5[arg0];
               }

               this.field6616 = class576.field7916 / 8 * this.field6621 >> 12;
               int var19 = class576.field7916 / var15 + 1;
               int[][] var20 = new int[var19][3];
               int[][] var21 = new int[var19][3];
               Random var22 = new Random((long)this.field6620);

               do {
                  int var10000;
                  int var23;
                  int var24;
                  int var25;
                  int var30;
                  do {
                     label88: {
                        var23 = var15 + class221.method1687(var22, 113, var16 - var15);
                        var24 = class221.method1687(var22, 85, -var17 + var18) + var17;
                        var25 = var9 + var23;
                        if (~class576.field7916 > ~var25) {
                           var25 = class576.field7916;
                           var10000 = -var9 + class576.field7916;
                           if (var3) {
                              break label88;
                           }

                           var23 = var10000;
                        }

                        var10000 = var12;
                     }

                     label150: {
                        if (var10000 == 0) {
                           int var26 = var10;
                           int[] var27 = var21[var10];
                           int var28 = 0;
                           int var29 = var6 + var25;
                           if (var29 < 0) {
                              var29 += class576.field7916;
                           }

                           if (~class576.field7916 > ~var29) {
                              var29 -= class576.field7916;
                           }

                           var30 = var27[2];

                           label146:
                           do {
                              while(true) {
                                 int[] var31 = var21[var26];
                                 if (~var29 <= ~var31[0] && var31[1] >= var29) {
                                    break label146;
                                 }

                                 ++var28;

                                 while(true) {
                                    ++var26;
                                    if (var13 > var26) {
                                       break;
                                    }

                                    var26 = 0;
                                    if (!var3) {
                                       continue label146;
                                    }
                                 }
                              }
                           } while(!var3);

                           if (var10 != var26) {
                              int var32 = var9 - -var6;
                              if (~var32 > -1) {
                                 var32 += class576.field7916;
                              }

                              if (var32 > class576.field7916) {
                                 var32 -= class576.field7916;
                              }

                              int var33 = 1;
                              if (var3 || var28 >= var33) {
                                 do {
                                    int[] var34 = var21[(var10 - -var33) % var13];
                                    var30 = Math.max(var30, var34[2]);
                                    ++var33;
                                 } while(var28 >= var33);
                              }

                              int var35 = 0;
                              if (var3 || ~var35 >= ~var28) {
                                 do {
                                    int[] var36 = var21[(var10 + var35) % var13];
                                    int var37 = var36[2];
                                    if (~var30 == ~var37) {
                                       ++var35;
                                    } else {
                                       int var40;
                                       int var41;
                                       label122: {
                                          int var38 = var36[0];
                                          int var39 = var36[1];
                                          if (~var29 < ~var32) {
                                             var40 = Math.max(var32, var38);
                                             var41 = Math.min(var29, var39);
                                             if (!var3) {
                                                break label122;
                                             }
                                          }

                                          if (var38 != 0) {
                                             var40 = Math.max(var32, var38);
                                             var41 = class576.field7916;
                                             if (var3) {
                                                var40 = 0;
                                                var41 = Math.min(var29, var39);
                                             }
                                          } else {
                                             var40 = 0;
                                             var41 = Math.min(var29, var39);
                                          }
                                       }

                                       this.method3493(var8 + var40, -var40 + var41, var5, var37, -var37 + var30, var22, (byte)66);
                                       ++var35;
                                    }
                                 } while(~var35 >= ~var28);
                              }
                           }

                           var10 = var26;
                           if (!var3) {
                              break label150;
                           }
                        }

                        var30 = 0;
                     }

                     label155: {
                        if (~(var24 + var30) >= ~class392.field5515) {
                           var11 = false;
                           if (!var3) {
                              break label155;
                           }
                        }

                        var24 = -var30 + class392.field5515;
                     }

                     if (class576.field7916 == var25) {
                        break;
                     }

                     int[] var42 = var20[var14++];
                     var42[1] = var25;
                     var42[2] = var30 - -var24;
                     var42[0] = var9;
                     this.method3493(var9 - -var7, var23, var5, var30, var24, var22, (byte)-108);
                     var9 = var25;
                  } while(!var3);

                  this.method3493(var7 + var9, var23, var5, var30, var24, var22, (byte)109);
                  if (var11) {
                     break;
                  }

                  var11 = true;
                  int[] var43 = var20[var14++];
                  var43[2] = var24 + var30;
                  var43[0] = var9;
                  var43[1] = var25;
                  int[][] var44 = var21;
                  var21 = var20;
                  var13 = var14;
                  var20 = var44;
                  var14 = 0;
                  var8 = var7;
                  var7 = class221.method1687(var22, -103, class576.field7916);
                  var9 = 0;
                  var6 = -var8 + var7;
                  int var45 = var6;
                  if (var6 < 0) {
                     var45 = class576.field7916 + var6;
                  }

                  var10 = 0;
                  if (var45 > class576.field7916) {
                     var45 -= class576.field7916;
                  }

                  label177:
                  do {
                     while(true) {
                        int[] var46 = var21[var10];
                        if (var45 >= var46[0] && ~var46[1] <= ~var45) {
                           break label177;
                        }

                        var10000 = ~var13;
                        ++var10;

                        while(var10000 >= ~var10) {
                           var10000 = 0;
                           if (!var3) {
                              var10 = 0;
                              continue label177;
                           }
                        }
                     }
                  } while(!var3);

                  var12 = 0;
               } while(!var3);
            }

            return var4;
         }
      } catch (RuntimeException var48) {
         throw class534.method3846(var48, field6630[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method3491(boolean arg0) {
      try {
         class416.field5849 = null;
         class560.field7677 = null;
         class790.field11554 = null;
         class768.field11077 = null;
         ++field6611;
         class639.field9014 = null;
         class345.field4945 = null;
         class511.field7076 = null;
         class181.field2240 = null;
         if (!arg0) {
            field6610 = -109;
         }

         class241.field2995 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6630[213] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(ILlia;I)V"
   )
   public static final void method3492(int arg0, class507 arg1, int arg2) {
      try {
         if (arg0 != 1337683308) {
            method3494((String)null, true, true, true);
         }

         ++field6627;
         if (class237.field2934) {
            class237.field2934 = false;
            arg2 = 0;
         }

         if (class349.field5000 == null || !class349.field5000.method3688((byte)104, arg1)) {
            class349.field5000 = arg1;
            class759.field10985 = class792.method5708(arg0 + -1337708313);
            class708.field10284 = arg2;
            class78.field974 = arg2;
            if (~class78.field974 != -1) {
               client.field4268 = class288.field3822;
               class356.field5072 = class682.field10007;
               class317.field4233 = class427.field5963;
               class224.field2815 = class114.field1411;
               class195.field2372 = class592.field8184;
               class680.field9970 = class277.field3704;
               class533.field7288 = class365.field5152;
               class406.field5731 = class13.field153;
               class329.field4712 = class430.field5992;
               class170.field2137 = class663.field9458;
               return;
            }

            class458.method3371(26);
         }

      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6630[3] + arg0 + ',' + (arg1 != null ? field6630[2] : field6630[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(II[[IIILjava/util/Random;B)V"
   )
   private final void method3493(int param1, int param2, int[][] param3, int param4, int param5, Random param6, byte param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(Ljava/lang/String;ZZZ)V"
   )
   public static final void method3494(String arg0, boolean arg1, boolean arg2, boolean arg3) {
      boolean var4 = client.field4273;

      try {
         ++field6614;

         try {
            if (arg0.equalsIgnoreCase(field6630[77]) || arg0.equalsIgnoreCase(field6630[72])) {
               class705.method5131(field6630[33], 0);
               class705.method5131(field6630[198], 0);
               class705.method5131(field6630[189], 0);
               class705.method5131(field6630[36], 0);
               class705.method5131(field6630[40], 0);
               return;
            }

            if (arg0.equalsIgnoreCase(field6630[123])) {
               class107.field1367 = 0;
               class86.field1112 = 0;
               return;
            }

            if (arg0.equalsIgnoreCase(field6630[209])) {
               class419.field5887 = !class419.field5887;
               if (class419.field5887) {
                  class705.method5131(field6630[85], 0);
                  return;
               }

               class705.method5131(field6630[163], 0);
               return;
            }

            if (arg0.equals(field6630[87])) {
               class386 var5 = class338.field4832.method499();
               class705.method5131(field6630[66] + var5.field5409, 0);
               class705.method5131(field6630[197] + var5.field5405, 0);
               class705.method5131(field6630[57] + var5.field5406, 0);
               class705.method5131(field6630[29] + var5.field5411, 0);
               class705.method5131(field6630[131] + var5.field5412, 0);
               return;
            }

            if (arg0.equals(field6630[158])) {
               class705.method5131(field6630[183] + class155.field2005 + field6630[185], 0);
               return;
            }

            if (!arg1) {
               method3494((String)null, false, false, true);
            }
         } catch (Exception var55) {
            class705.method5131(class551.field7520.method3980(class494.field6787, true), 0);
            return;
         }

         if (class304.field4027 != class269.field3480 || class179.field2223 >= 2) {
            if (arg0.equalsIgnoreCase(field6630[95])) {
               throw new RuntimeException();
            }

            if (arg0.equals(field6630[68])) {
               throw new OutOfMemoryError(field6630[138]);
            }

            try {
               label813: {
                  if (arg0.equalsIgnoreCase(field6630[132])) {
                     class705.method5131(field6630[32] + class118.field1444, 0);
                     return;
                  }

                  if (arg0.equalsIgnoreCase(field6630[179])) {
                     class233.field2888 = !class233.field2888;
                     if (class233.field2888) {
                        class705.method5131(field6630[151], 0);
                        return;
                     }

                     class705.method5131(field6630[14], 0);
                     return;
                  }

                  if (arg0.equalsIgnoreCase(field6630[9])) {
                     class419.field5887 = true;
                     class705.method5131(field6630[147], 0);
                     return;
                  }

                  if (arg0.equalsIgnoreCase(field6630[175])) {
                     class419.field5887 = false;
                     class705.method5131(field6630[102], 0);
                     return;
                  }

                  if (arg0.equals(field6630[94])) {
                     try {
                        class705.method5131(field6630[21] + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class334.field4792.field10589 + field6630[184], 0);
                        return;
                     } catch (Throwable var49) {
                        return;
                     }
                  }

                  if (arg0.equalsIgnoreCase(field6630[159])) {
                     class266.field3457.method3113(123);
                     class705.method5131(field6630[53], 0);
                     return;
                  }

                  if (!arg0.equalsIgnoreCase(field6630[98])) {
                     if (!arg0.equalsIgnoreCase(field6630[99])) {
                        if (arg0.equalsIgnoreCase(field6630[177])) {
                           class705.method5131(!class312.method2344((byte)101) ? field6630[146] : field6630[108], 0);
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field6630[25])) {
                           class705.method5131(field6630[71], 0);
                           if (class445.field6162 != 11) {
                              if (class445.field6162 == 12) {
                                 class605.field8474.field2800 = true;
                                 return;
                              }
                           } else {
                              class709.method5177((byte)75);
                           }

                           return;
                        }

                        if (arg0.equalsIgnoreCase(field6630[137])) {
                           class698.field10191.method3348((byte)-128);
                           class705.method5131(field6630[160], 0);
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field6630[54])) {
                           class73.field896.method1090(20997);
                           class705.method5131(field6630[194], 0);
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field6630[155])) {
                           class73.field896.method1099(-3717);
                           class705.method5131(field6630[176], 0);
                           return;
                        }

                        if (!arg0.equalsIgnoreCase(field6630[173])) {
                           if (arg0.equalsIgnoreCase(field6630[143])) {
                              class95.method885(1);
                              class217.method1653(-1);
                              class705.method5131(field6630[206], 0);
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[19])) {
                              class291.field3843 = class792.method5708(-25005);
                              class559.field7673 = true;
                              class95.method885(1);
                              class217.method1653(-1);
                              class705.method5131(field6630[172], 0);
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[56])) {
                              class697.method5071((byte)124, -1, 1, -1, false);
                              if (~class600.method4374(118) != -2) {
                                 class705.method5131(field6630[10], 0);
                                 return;
                              }

                              class705.method5131(field6630[210], 0);
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[60])) {
                              class697.method5071((byte)79, -1, 2, -1, false);
                              if (~class600.method4374(119) == -3) {
                                 class705.method5131(field6630[78], 0);
                                 return;
                              }

                              class705.method5131(field6630[69], 0);
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[169])) {
                              class697.method5071((byte)108, 1024, 3, 768, false);
                              if (~class600.method4374(122) == -4) {
                                 class705.method5131(field6630[162], 0);
                                 return;
                              }

                              class705.method5131(field6630[203], 0);
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[207])) {
                              class594.method4335(false, Integer.MAX_VALUE, 0);
                              if (class674.field9907.field8451.method2770((byte)-88) != 0) {
                                 class705.method5131(field6630[121], 0);
                                 return;
                              }

                              class705.method5131(field6630[180], 0);
                              class674.field9907.method4407(class674.field9907.field8420, -2160, 0);
                              class647.method4661((byte)87);
                              class429.field5979 = false;
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[26])) {
                              class594.method4335(false, Integer.MAX_VALUE, 1);
                              if (~class674.field9907.field8451.method2770((byte)-100) == -2) {
                                 class705.method5131(field6630[107], 0);
                                 class674.field9907.method4407(class674.field9907.field8420, -2160, 1);
                                 class647.method4661((byte)-68);
                                 class429.field5979 = false;
                                 return;
                              }

                              class705.method5131(field6630[75], 0);
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[148])) {
                              class594.method4335(false, Integer.MAX_VALUE, 2);
                              if (class674.field9907.field8451.method2770((byte)-128) == 2) {
                                 class705.method5131(field6630[115], 0);
                                 class674.field9907.method4407(class674.field9907.field8420, -2160, 2);
                                 class647.method4661((byte)-51);
                                 class429.field5979 = false;
                                 return;
                              }

                              class705.method5131(field6630[31], 0);
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[212])) {
                              class594.method4335(false, Integer.MAX_VALUE, 3);
                              if (class674.field9907.field8451.method2770((byte)-128) == 3) {
                                 class705.method5131(field6630[100], 0);
                                 class674.field9907.method4407(class674.field9907.field8420, -2160, 3);
                                 class647.method4661((byte)102);
                                 class429.field5979 = false;
                                 return;
                              }

                              class705.method5131(field6630[134], 0);
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[140])) {
                              class594.method4335(false, Integer.MAX_VALUE, 5);
                              if (class674.field9907.field8451.method2770((byte)-107) == 5) {
                                 class705.method5131(field6630[51], 0);
                                 class674.field9907.method4407(class674.field9907.field8420, -2160, 5);
                                 class647.method4661((byte)88);
                                 class429.field5979 = false;
                                 return;
                              }

                              class705.method5131(field6630[149], 0);
                              return;
                           }

                           if (arg0.startsWith(field6630[182])) {
                              if (arg0.length() < 6) {
                                 class705.method5131(field6630[80], 0);
                                 return;
                              }

                              int var17 = class76.method747(11732, arg0.substring(6));
                              if (~var17 <= -1 && ~var17 >= ~class216.method1644(100, class155.field2005)) {
                                 class674.field9907.method4407(class674.field9907.field8435, -2160, var17);
                                 class647.method4661((byte)-68);
                                 class429.field5979 = false;
                                 class705.method5131(field6630[193] + class674.field9907.field8435.method5180((byte)-112), 0);
                                 return;
                              }

                              class705.method5131(field6630[80], 0);
                              return;
                           }

                           if (arg0.startsWith(field6630[118])) {
                              if (arg0.length() < 10) {
                                 class705.method5131(field6630[133], 0);
                                 return;
                              }

                              class309.field4103 = class76.method747(11732, arg0.substring(10).trim());
                              class705.method5131(field6630[152] + class309.field4103, 0);
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[204])) {
                              class92.field1233 = true;
                              class705.method5131(field6630[92] + class92.field1233, 0);
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[105])) {
                              class238.field2960 = !class238.field2960;
                              class705.method5131(field6630[24] + class238.field2960, 0);
                              return;
                           }

                           if (arg0.startsWith(field6630[201])) {
                              boolean var18 = class338.field4832.method583();
                              if (!class292.method2195(!var18, -122)) {
                                 class705.method5131(field6630[20], 0);
                                 return;
                              }

                              if (var18) {
                                 class705.method5131(field6630[199], 0);
                                 return;
                              }

                              class705.method5131(field6630[130], 0);
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[188])) {
                              if (!class305.field4050) {
                                 class305.field4050 = true;
                                 class705.method5131(field6630[12], 0);
                                 return;
                              }

                              class305.field4050 = false;
                              class705.method5131(field6630[11], 0);
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[65])) {
                              if (class182.field2251) {
                                 class705.method5131(field6630[38], 0);
                                 class182.field2251 = false;
                                 return;
                              }

                              class705.method5131(field6630[150], 0);
                              class182.field2251 = true;
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[59])) {
                              class705.method5131(field6630[48] + (class278.field3709.field999 >> 9) + field6630[93] + (class278.field3709.field1003 >> 9), 0);
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[142])) {
                              class705.method5131(field6630[88] + class93.field1241[class278.field3709.field1001].method2221(!arg1, class278.field3709.field1003 >> 9, class278.field3709.field999 >> 9), 0);
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[101])) {
                              class354.field5051.method708(0);
                              class354.field5051.method723(90);
                              class599.field8358.method2389(64);
                              class25.field315.method5237((byte)-103);
                              class217.method1653(-1);
                              class705.method5131(field6630[84], 0);
                              return;
                           }

                           if (arg0.startsWith(field6630[42])) {
                              if (!class338.field4832.method493()) {
                                 class705.method5131(field6630[145], 0);
                                 return;
                              }

                              int var19;
                              label607: {
                                 var19 = Integer.parseInt(arg0.substring(3));
                                 if (~var19 > -2) {
                                    var19 = 1;
                                    if (!var4) {
                                       break label607;
                                    }
                                 }

                                 if (var19 > 4) {
                                    var19 = 4;
                                 }
                              }

                              class33.field393 = var19;
                              class95.method885(1);
                              class705.method5131(field6630[90] + class33.field393, 0);
                              return;
                           }

                           if (arg0.startsWith(field6630[70])) {
                              class705.method5131(field6630[171] + class270.field3517.method4242(0) + "/" + class270.field3517.method4249(5283), 0);
                              class705.method5131(field6630[39] + class663.field9447.method4242(0) + "/" + class663.field9447.method4249(5283), 0);
                              class705.method5131(field6630[117] + class645.field9054.field717.method1224(0) + "/" + class645.field9054.field717.method1225(110), 0);
                              return;
                           }

                           if (arg0.equalsIgnoreCase(field6630[67])) {
                              class705.method5131(field6630[141] + class278.field3709.field1001 + "," + ((class737.field10747 >> 9) - -class752.field10921 >> 6) + "," + ((class532.field7284 >> 9) - -class17.field237 >> 6) + "," + (63 & (class737.field10747 >> 9) + class752.field10921) + "," + ((class532.field7284 >> 9) + class17.field237 & 63) + field6630[114] + (class687.method5016(class737.field10747, class278.field3709.field1001, class532.field7284, 2) - class331.field4733), 0);
                              class705.method5131(field6630[124] + class278.field3709.field1001 + "," + (class752.field10921 + class484.field6672 >> 6) + "," + (class612.field8550 + class17.field237 >> 6) + "," + (63 & class484.field6672 - -class752.field10921) + "," + (63 & class612.field8550 + class17.field237) + field6630[114] + (class687.method5016(class484.field6672, class278.field3709.field1001, class612.field8550, 2) - class510.field7064), 0);
                              return;
                           }

                           if (!arg0.equals(field6630[202]) && !arg0.equals(field6630[111])) {
                              if (arg0.startsWith(field6630[125])) {
                                 int var20 = -1;
                                 int var21 = 1000;
                                 if (~arg0.length() < -16) {
                                    String[] var22 = class249.method1870(' ', arg0, false);

                                    try {
                                       if (~var22.length < -2) {
                                          var21 = Integer.parseInt(var22[1]);
                                       }
                                    } catch (Throwable var51) {
                                    }

                                    try {
                                       if (var22.length > 2) {
                                          var20 = Integer.parseInt(var22[2]);
                                       }
                                    } catch (Throwable var50) {
                                    }
                                 }

                                 if (~var20 != 0) {
                                    class705.method5131(field6630[110] + class683.method4990(114, var20, var21), 0);
                                    return;
                                 }

                                 class705.method5131(field6630[195] + class683.method4990(-98, 0, var21), 0);
                                 class705.method5131(field6630[192] + class683.method4990(99, 2, var21), 0);
                                 class705.method5131(field6630[154] + class683.method4990(-86, 3, var21), 0);
                                 class705.method5131(field6630[139] + class683.method4990(-119, 1, var21), 0);
                                 class705.method5131(field6630[41] + class683.method4990(-71, 5, var21), 0);
                                 return;
                              }

                              if (arg0.equals(field6630[50])) {
                                 class494.field6788 = !class494.field6788;
                                 class705.method5131(field6630[74] + class494.field6788, 0);
                                 return;
                              }

                              if (arg0.equals(field6630[8])) {
                                 class277.method2110(true);
                                 class705.method5131(field6630[83], 0);
                                 return;
                              }

                              if (arg0.startsWith(field6630[61])) {
                                 int var23 = Integer.parseInt(arg0.substring(12));
                                 class543.method3926(var23, -29330, class281.method2144(var23, true).field968);
                                 class705.method5131(field6630[106], 0);
                                 return;
                              }

                              if (arg0.equals(field6630[86])) {
                                 class705.method5131(field6630[73] + class698.field10191.field6242, 0);
                                 return;
                              }

                              if (arg0.startsWith(field6630[165])) {
                                 class223 var24 = class355.method2790(13111);
                                 class471 var25 = class133.method1118(var24.field2787, 2, class648.field9086);
                                 var25.field6527.method4318(0, 0);
                                 int var26 = var25.field6527.field8243;
                                 int var27 = arg0.indexOf(" ", 4);
                                 var25.field6527.method4332((byte)-96, arg0.substring(3, var27));
                                 class463.method3400(var25.field6527, true, arg0.substring(var27));
                                 var25.field6527.method4331(9678, -var26 + var25.field6527.field8243);
                                 var24.method1702((byte)-124, var25);
                                 return;
                              }

                              if (arg0.equals(field6630[104])) {
                                 class588.method4224(4);
                                 class705.method5131(field6630[129], 0);
                                 return;
                              }

                              if (!arg0.equals(field6630[208])) {
                                 if (arg0.equals(field6630[168])) {
                                    class392.field5507 = true;
                                    class217.method1653(-1);
                                    class705.method5131(field6630[205], 0);
                                    return;
                                 }

                                 if (arg0.equals(field6630[17])) {
                                    class392.field5507 = false;
                                    class217.method1653(-1);
                                    class705.method5131(field6630[164], 0);
                                    return;
                                 }

                                 if (arg0.equals(field6630[97])) {
                                    class749.method5415(true);
                                    class705.method5131(field6630[119], 0);
                                    return;
                                 }

                                 if (arg0.equals(field6630[79])) {
                                    class705.method5131(class249.method1875(-46) + field6630[196], 0);
                                    return;
                                 }

                                 if (arg0.startsWith(field6630[126])) {
                                    int var29 = Integer.parseInt(arg0.substring(17));
                                    class705.method5131(field6630[122] + class259.field3320.method3040(var29, 0), 0);
                                    return;
                                 }

                                 if (arg0.startsWith(field6630[49])) {
                                    int var30 = Integer.parseInt(arg0.substring(14));
                                    class705.method5131(field6630[127] + class259.field3320.method3032(var30, 0), 0);
                                    return;
                                 }

                                 if (arg0.startsWith(field6630[81])) {
                                    String[] var31 = class249.method1870(' ', arg0.substring(12), false);
                                    if (var31.length >= 2) {
                                       int var32 = var31.length <= 2 ? 0 : Integer.parseInt(var31[2]);
                                       class30.method248(var32, var31[0], 0, var31[1]);
                                       return;
                                    }
                                 }

                                 if (arg0.startsWith(field6630[187])) {
                                    String[] var33 = class249.method1870(' ', arg0.substring(8), !arg1);
                                    int var34 = Integer.parseInt(var33[0]);
                                    int var35 = var33.length != 2 ? 0 : Integer.parseInt(var33[1]);
                                    class420.method3179(1124524848, var35, var34);
                                    return;
                                 }

                                 if (arg0.startsWith(field6630[23])) {
                                    class16.method129();
                                    return;
                                 }

                                 if (arg0.startsWith(field6630[35])) {
                                    class16.method122(100, false);
                                    return;
                                 }

                                 if (arg0.startsWith(field6630[43])) {
                                    class16.method122(10, true);
                                    return;
                                 }

                                 if (arg0.startsWith(field6630[128])) {
                                    int var36 = Integer.parseInt(arg0.substring(8));
                                    class338.field4832.method572(var36);
                                    return;
                                 }

                                 if (arg0.equals(field6630[28])) {
                                    class705.method5131(field6630[112] + class717.field10509.method2174(), 0);
                                    return;
                                 }

                                 if (arg0.equals(field6630[166])) {
                                    class784.method5647(1024);
                                    class705.method5131(field6630[46] + class674.field9907.field8451.method2770((byte)-95), 0);
                                    return;
                                 }

                                 if (arg0.equals(field6630[156])) {
                                    class705.method5131(class15.field197.method804(-12281), 0);
                                    return;
                                 }

                                 if (arg0.equals(field6630[161])) {
                                    label615: {
                                       if (class255.field3248.startsWith(field6630[167])) {
                                          class564.method4050(new File(field6630[91]), (byte)17, false);
                                          if (!var4) {
                                             break label615;
                                          }
                                       }

                                       class564.method4050(new File(field6630[178]), (byte)44, false);
                                    }

                                    class705.method5131(field6630[16], 0);
                                    return;
                                 }

                                 if (arg0.equals(field6630[136])) {
                                    class705.method5131(field6630[197] + class255.field3248, 0);
                                    class705.method5131(field6630[144] + class255.field3245, 0);
                                    class705.method5131(field6630[22] + class255.field3261, 0);
                                    return;
                                 }

                                 if (arg0.startsWith(field6630[76])) {
                                    int var37 = Integer.parseInt(arg0.substring(8, 9));
                                    class758.field10979 = var37;
                                    class95.method885(1);
                                    class705.method5131(field6630[153], 0);
                                    return;
                                 }

                                 if (arg0.startsWith(field6630[82])) {
                                    int var38 = arg0.indexOf(32);
                                    if (~var38 > -1) {
                                       class705.method5131(field6630[52], 0);
                                       return;
                                    }

                                    int var39 = class76.method747(11732, arg0.substring(var38 + 1));
                                    class674.field9907.method4407(class674.field9907.field8471, -2160, var39);
                                    class647.method4661((byte)-41);
                                    class429.field5979 = false;
                                    class773.method5531(-3023);
                                    if (class674.field9907.field8471.method2851((byte)-104) == var39) {
                                       class705.method5131(field6630[181], 0);
                                       return;
                                    }

                                    class705.method5131(field6630[116], 0);
                                    return;
                                 }

                                 if (arg0.startsWith(field6630[15])) {
                                    if (~class674.field9907.field8471.method2851((byte)-77) == -1) {
                                       class705.method5131(field6630[96], 0);
                                       return;
                                    }

                                    int var40 = class76.method747(11732, arg0.substring(arg0.indexOf(32) - -1));
                                    class334.field4788 = var40;
                                    class705.method5131(field6630[191] + class334.field4788, 0);
                                    return;
                                 }

                                 if (arg0.startsWith(field6630[113])) {
                                    int var41 = class76.method747(11732, arg0.substring(arg0.indexOf(32) + 1));
                                    class14.field190 = var41;
                                    class133.field1733 = var41;
                                    class705.method5131(field6630[135] + var41, 0);
                                    class773.method5531(-3023);
                                    return;
                                 }

                                 if (arg0.equals(field6630[37])) {
                                    class624.field8717 = !class624.field8717;
                                    class705.method5131(field6630[109] + (class624.field8717 ? field6630[157] : field6630[120]), 0);
                                    return;
                                 }

                                 if (arg0.startsWith(field6630[13])) {
                                    File var42 = new File(arg0.substring(10));
                                    if (var42.exists()) {
                                       var42 = new File(arg0.substring(10) + "." + class792.method5708(-25005) + field6630[64]);
                                       if (var42.exists()) {
                                          class705.method5131(field6630[34], 0);
                                          return;
                                       }
                                    }

                                    if (class464.field6362 != null) {
                                       class464.field6362.close();
                                       class464.field6362 = null;
                                    }

                                    try {
                                       class464.field6362 = new FileOutputStream(var42);
                                       return;
                                    } catch (FileNotFoundException var52) {
                                       class705.method5131(field6630[103] + var42.getName(), 0);
                                       return;
                                    } catch (SecurityException var53) {
                                       class705.method5131(field6630[27] + var42.getName(), 0);
                                       return;
                                    }
                                 }

                                 if (arg0.equals(field6630[55])) {
                                    if (class464.field6362 != null) {
                                       class464.field6362.close();
                                    }

                                    class464.field6362 = null;
                                    return;
                                 }

                                 if (arg0.startsWith(field6630[62])) {
                                    File var43 = new File(arg0.substring(10));
                                    if (!var43.exists()) {
                                       class705.method5131(field6630[89], 0);
                                       return;
                                    }

                                    byte[] var44 = class607.method4436(var43, false);
                                    if (var44 == null) {
                                       class705.method5131(field6630[45], 0);
                                       return;
                                    }

                                    String[] var45 = class249.method1870('\n', class597.method4353(class463.method3401(-114, var44), '\r', "", 19716), !arg1);
                                    class140.method1193(var45, -96);
                                 }

                                 if (arg0.startsWith(field6630[190])) {
                                    short var46 = (short)class76.method747(11732, arg0.substring(5));
                                    if (~var46 < -1) {
                                       class162.field2042 = var46;
                                    }

                                    return;
                                 }

                                 if (arg0.startsWith(field6630[211])) {
                                    if (~arg0.length() < -10 && arg0.charAt(8) == ' ') {
                                       class16.field230 = arg0.substring(9);
                                       class16.field232 = true;
                                       class705.method5131(field6630[18] + class16.field230 + ")", 0);
                                       return;
                                    }

                                    class16.field230 = null;
                                    class16.field232 = !class16.field232;
                                    class705.method5131(field6630[47] + class16.field232, 0);
                                    return;
                                 }

                                 if (~class445.field6162 == -12) {
                                    ++class667.field9481;
                                    class471 var47 = class133.method1118(class605.field8474.field2787, 2, class298.field3948);
                                    var47.field6527.method4318(3 + arg0.length(), 0);
                                    var47.field6527.method4318(arg2 ? 1 : 0, 0);
                                    var47.field6527.method4318(!arg3 ? 0 : 1, 0);
                                    var47.field6527.method4332((byte)-103, arg0);
                                    class605.field8474.method1702((byte)-50, var47);
                                 }

                                 if (arg0.startsWith(field6630[63]) && class304.field4027 != class269.field3480) {
                                    class40.method303(2, class76.method747(11732, arg0.substring(4)));
                                    return;
                                 }
                                 break label813;
                              }

                              int var28 = 0;
                              if (var4) {
                                 if (class535.field7311[var28]) {
                                    class576.field7918[var28] = (int)(Math.random() * 99999.0D);
                                    if (Math.random() > 0.5D) {
                                       class576.field7918[var28] *= -1;
                                    }
                                 }

                                 ++var28;
                              }

                              while(true) {
                                 while(~class576.field7918.length < ~var28) {
                                    if (class535.field7311[var28]) {
                                       class576.field7918[var28] = (int)(Math.random() * 99999.0D);
                                       if (Math.random() > 0.5D) {
                                          class576.field7918[var28] *= -1;
                                       }
                                    }

                                    ++var28;
                                 }

                                 class588.method4224(4);
                                 class705.method5131(field6630[170], 0);
                                 if (!var4) {
                                    return;
                                 }

                                 ++var28;
                              }
                           }

                           class330.field4730 = !class330.field4730;
                           class338.field4832.method554(class330.field4730);
                           class261.method2002((byte)-127);
                           class705.method5131(field6630[44] + class330.field4730, 0);
                           return;
                        }

                        class61.field671.method1942((byte)39);
                        class223[] var14 = class605.field8475;
                        int var15 = 0;
                        class223 var16;
                        if (var4) {
                           var16 = var14[var15];
                           if (var16.field2779 != null) {
                              var16.field2779.method1027((byte)-117);
                           }

                           ++var15;
                        }

                        while(~var15 > ~var14.length) {
                           var16 = var14[var15];
                           if (var16.field2779 != null) {
                              var16.field2779.method1027((byte)-117);
                           }

                           ++var15;
                        }

                        class73.field896.method1091(true);
                        class705.method5131(field6630[186], 0);
                        return;
                     }

                     class766.method5493((byte)98);
                     int var9 = 0;
                     if (var4) {
                        System.gc();
                        ++var9;
                     }

                     while(true) {
                        if (~var9 <= -11) {
                           Runtime var10 = Runtime.getRuntime();
                           int var11 = (int)((var10.totalMemory() + -var10.freeMemory()) / 1024L);
                           class705.method5131(field6630[174] + var11 + "k", 0);
                           if (!var4) {
                              class570.method4092(!arg1);
                              class766.method5493((byte)68);
                              int var12 = 0;
                              if (var4) {
                                 System.gc();
                                 ++var12;
                              }

                              while(true) {
                                 if (var12 >= 10) {
                                    int var13 = (int)((var10.totalMemory() + -var10.freeMemory()) / 1024L);
                                    class705.method5131(field6630[200] + var13 + "k", 0);
                                    if (!var4) {
                                       return;
                                    }
                                 } else {
                                    System.gc();
                                 }

                                 ++var12;
                              }
                           }
                        } else {
                           System.gc();
                        }

                        ++var9;
                     }
                  }

                  class766.method5493((byte)58);
                  int var6 = 0;
                  if (var4) {
                     System.gc();
                     ++var6;
                  }

                  while(true) {
                     while(var6 < 10) {
                        System.gc();
                        ++var6;
                     }

                     Runtime var7 = Runtime.getRuntime();
                     int var8 = (int)((var7.totalMemory() - var7.freeMemory()) / 1024L);
                     class705.method5131(field6630[58] + var8 + "k", 0);
                     if (!var4) {
                        return;
                     }

                     ++var6;
                  }
               }
            } catch (Exception var54) {
               class705.method5131(class551.field7520.method3980(class494.field6787, true), 0);
               return;
            }
         }

         if (~class445.field6162 != -12) {
            class705.method5131(class551.field7524.method3980(class494.field6787, true) + arg0, 0);
         }
      } catch (RuntimeException var56) {
         throw class534.method3846(var56, field6630[30] + (arg0 != null ? field6630[2] : field6630[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "<init>",
      descriptor = "()V"
   )
   public class479() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!uda",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1457(int arg0) {
      try {
         ++field6624;
         if (arg0 != 28274) {
            this.field6612 = 87;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6630[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3495(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3496(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
