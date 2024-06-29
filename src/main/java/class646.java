import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class646 extends class557 {
   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9098 = new String[]{method4706(method4705("_VG'#")), method4706(method4705("K\u0012\b'\u0017\f")), method4706(method4705("J\r\u0005e")), method4706(method4705("K\u0012\b'\u0012\f")), method4706(method4705("K\u0012\b'\u0019\f")), method4706(method4705("K\u0012\b'\u001c\f")), method4706(method4705("K\u0012\b'\u0018\f")), method4706(method4705("K\u0012\b'\u001d\f")), method4706(method4705("K\u0012\b'\u0014\f")), method4706(method4705("K\u0012\b'\u0016\f")), method4706(method4705("K\u0012\b'\u001b\f")), method4706(method4705("K\u0012\b'\u001f\f")), method4706(method4705("K\u0012\b'\u0015\f")), method4706(method4705("K\u0012\b'\u001a\f"))};
   @OriginalMember(
      owner = "client!oja",
      name = "j",
      descriptor = "Lhha;"
   )
   public static class724 field9093 = new class724(117, 28);
   @OriginalMember(
      owner = "client!oja",
      name = "u",
      descriptor = "[[I"
   )
   public static int[][] field9094 = new int[128][128];
   @OriginalMember(
      owner = "client!oja",
      name = "s",
      descriptor = "Lhha;"
   )
   public static class724 field9097 = new class724(34, 3);
   @OriginalMember(
      owner = "client!oja",
      name = "r",
      descriptor = "I"
   )
   public static int field9084;
   @OriginalMember(
      owner = "client!oja",
      name = "l",
      descriptor = "I"
   )
   public static int field9085;
   @OriginalMember(
      owner = "client!oja",
      name = "t",
      descriptor = "I"
   )
   public static int field9086;
   @OriginalMember(
      owner = "client!oja",
      name = "o",
      descriptor = "I"
   )
   public static int field9087;
   @OriginalMember(
      owner = "client!oja",
      name = "i",
      descriptor = "I"
   )
   public static int field9088;
   @OriginalMember(
      owner = "client!oja",
      name = "m",
      descriptor = "I"
   )
   public static int field9089;
   @OriginalMember(
      owner = "client!oja",
      name = "q",
      descriptor = "I"
   )
   public static int field9090;
   @OriginalMember(
      owner = "client!oja",
      name = "k",
      descriptor = "I"
   )
   public static int field9091;
   @OriginalMember(
      owner = "client!oja",
      name = "p",
      descriptor = "I"
   )
   public static int field9092;
   @OriginalMember(
      owner = "client!oja",
      name = "h",
      descriptor = "I"
   )
   public static int field9095;
   @OriginalMember(
      owner = "client!oja",
      name = "n",
      descriptor = "I"
   )
   public static int field9096;

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.method92(105, 51);
         }

         ++field9087;
         super.field7905 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9098[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         ++field9089;
         super.field7905 = this.method97(0);
         if (arg0 != -22) {
            method4698(-90);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9098[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4697(int arg0) {
      try {
         ++field9088;
         if (arg0 >= -52) {
            field9097 = null;
         }

         return super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9098[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class646(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!oja",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4698(int arg0) {
      try {
         field9093 = null;
         if (arg0 != 214) {
            method4699((byte)-72);
         }

         field9097 = null;
         field9094 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9098[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class646(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oja",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method4699(byte arg0) {
      try {
         class196.field2827.method1045(3);
         ++field9096;
         class564.field8028.method1045(3);
         class571.field8093.method1045(3);
         class744.field10581.method1045(3);
         if (arg0 > -103) {
            method4699((byte)-92);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9098[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field9092;
         if (arg0 != 1) {
            field9093 = null;
         }

         return 3;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9098[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method4700(int arg0, int arg1) {
      try {
         label16: {
            if (class487.field6949 == arg1) {
               class691.field9950.method1156(arg0, true);
               if (!client.field10022) {
                  break label16;
               }
            }

            class438.field6424 = arg0;
         }

         ++field9090;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9098[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         ++field9095;
         if (arg0 != 0) {
            return 61;
         } else {
            return !super.field7906.method4710(-128) ? 0 : 1;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9098[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(CZ)C"
   )
   public static final char method4701(char arg0, boolean arg1) {
      try {
         ++field9091;
         if (arg1) {
            return '{';
         } else if (~arg0 != -33 && ~arg0 != -161 && arg0 != '_' && ~arg0 != -46) {
            if (~arg0 != -92 && arg0 != ']' && ~arg0 != -36) {
               if (~arg0 != -225 && arg0 != 225 && arg0 != 226 && ~arg0 != -229 && arg0 != 227 && arg0 != 192 && ~arg0 != -194 && arg0 != 194 && arg0 != 196 && ~arg0 != -196) {
                  if (~arg0 != -233 && ~arg0 != -234 && arg0 != 234 && arg0 != 235 && arg0 != 200 && arg0 != 201 && arg0 != 202 && arg0 != 203) {
                     if (~arg0 != -238 && arg0 != 238 && arg0 != 239 && arg0 != 205 && ~arg0 != -207 && arg0 != 207) {
                        if (~arg0 != -243 && arg0 != 243 && ~arg0 != -245 && ~arg0 != -247 && ~arg0 != -246 && ~arg0 != -211 && ~arg0 != -212 && arg0 != 212 && arg0 != 214 && ~arg0 != -214) {
                           if (~arg0 != -250 && ~arg0 != -251 && arg0 != 251 && arg0 != 252 && arg0 != 217 && ~arg0 != -219 && arg0 != 219 && ~arg0 != -221) {
                              if (arg0 != 231 && arg0 != 199) {
                                 if (arg0 != 255 && ~arg0 != -377) {
                                    if (~arg0 != -242 && arg0 != 209) {
                                       if (~arg0 != -224) {
                                          return Character.toLowerCase(arg0);
                                       } else if (!client.field10022) {
                                          return 'b';
                                       } else {
                                          return '_';
                                       }
                                    } else {
                                       return 'n';
                                    }
                                 } else {
                                    return 'y';
                                 }
                              } else {
                                 return 'c';
                              }
                           } else {
                              return 'u';
                           }
                        } else {
                           return 'o';
                        }
                     } else {
                        return 'i';
                     }
                  } else {
                     return 'e';
                  }
               } else {
                  return 'a';
               }
            } else {
               return arg0;
            }
         } else {
            return '_';
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9098[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4702(boolean arg0) {
      boolean var1 = client.field10022;

      try {
         ++field9086;
         if (arg0) {
            if (class687.field9907 == null) {
               int var2 = class245.field3760;
               int var3 = class541.field7634;
               int var4 = -class557.field7909 + class91.field1368 + -var2;
               int var5 = -var3 + class223.field3171 - class140.field2243;
               if (~var2 < -1 || var4 > 0 || ~var3 < -1 || var5 > 0) {
                  try {
                     Container var6;
                     label55: {
                        if (class800.field11642 == null) {
                           if (class289.field4303 == null) {
                              var6 = class65.field898;
                              if (!var1) {
                                 break label55;
                              }
                           }

                           var6 = class289.field4303;
                           if (!var1) {
                              break label55;
                           }
                        }

                        var6 = class800.field11642;
                     }

                     int var7 = 0;
                     int var8 = 0;
                     if (class800.field11642 == var6) {
                        Insets var9 = class800.field11642.getInsets();
                        var8 = var9.top;
                        var7 = var9.left;
                     }

                     Graphics var10 = var6.getGraphics();
                     var10.setColor(Color.black);
                     if (var2 > 0) {
                        var10.fillRect(var7, var8, var2, class223.field3171);
                     }

                     if (~var3 < -1) {
                        var10.fillRect(var7, var8, class91.field1368, var3);
                     }

                     if (var4 > 0) {
                        var10.fillRect(var7 - (-class91.field1368 - -var4), var8, var4, class223.field3171);
                     }

                     if (var5 > 0) {
                        var10.fillRect(var7, class223.field3171 + var8 + -var5, class91.field1368, var5);
                        return;
                     }
                  } catch (Exception var12) {
                     return;
                  }
               }

            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field9098[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(BLjava/lang/String;)Z"
   )
   public static final boolean method4703(byte arg0, String arg1) {
      try {
         int var2 = 28 / ((arg0 - 79) / 32);
         ++field9085;
         return class748.field10639.containsKey(arg1);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9098[11] + arg0 + ',' + (arg1 != null ? field9098[0] : field9098[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(Lcu;I)Liu;"
   )
   public static final class53 method4704(class65 arg0, int arg1) {
      try {
         if (arg1 >= -39) {
            return null;
         } else {
            ++field9084;
            class612 var2 = class399.method3110(arg0, false);
            int var3 = arg0.method685(-2);
            int var4 = arg0.method685(-2);
            int var5 = arg0.method685(-2);
            int var6 = arg0.method685(-2);
            int var7 = arg0.method685(-2);
            int var8 = arg0.method685(-2);
            return new class53(var2.field8705, var2.field8709, var2.field8712, var2.field8703, var2.field8701, var2.field8708, var2.field8707, var2.field8706, var2.field8704, var3, var4, var5, var6, var7, var8);
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field9098[1] + (arg0 != null ? field9098[0] : field9098[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4705(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4706(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
