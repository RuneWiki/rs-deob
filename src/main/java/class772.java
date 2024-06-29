import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class772 extends class500 {
   @OriginalMember(
      owner = "client!ob",
      name = "o",
      descriptor = "Z"
   )
   private boolean field11139 = true;
   @OriginalMember(
      owner = "client!ob",
      name = "v",
      descriptor = "I"
   )
   public int field11137 = 0;
   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   public String field11145 = null;
   @OriginalMember(
      owner = "client!ob",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11147 = new String[]{method5530(method5529("wm85\r")), method5530(method5529("vzz\u001c")), method5530(method5529("wm8LLvfbN\r")), method5530(method5529("c!8^X")), method5530(method5529("wm83\r")), method5530(method5529("wm87\r")), method5530(method5529("wm84\r")), method5530(method5529("wm86\r")), method5530(method5529("wm81\r")), method5530(method5529("wm82\r")), method5530(method5529("\u007faf\u001fS)"))};
   @OriginalMember(
      owner = "client!ob",
      name = "p",
      descriptor = "B"
   )
   public byte field11140;
   @OriginalMember(
      owner = "client!ob",
      name = "r",
      descriptor = "B"
   )
   public byte field11144;
   @OriginalMember(
      owner = "client!ob",
      name = "m",
      descriptor = "I"
   )
   public static int field11130;
   @OriginalMember(
      owner = "client!ob",
      name = "k",
      descriptor = "I"
   )
   public static int field11131;
   @OriginalMember(
      owner = "client!ob",
      name = "q",
      descriptor = "I"
   )
   public static int field11133;
   @OriginalMember(
      owner = "client!ob",
      name = "t",
      descriptor = "I"
   )
   public static int field11135;
   @OriginalMember(
      owner = "client!ob",
      name = "y",
      descriptor = "I"
   )
   public static int field11136;
   @OriginalMember(
      owner = "client!ob",
      name = "w",
      descriptor = "I"
   )
   public static int field11138;
   @OriginalMember(
      owner = "client!ob",
      name = "j",
      descriptor = "I"
   )
   public static int field11141;
   @OriginalMember(
      owner = "client!ob",
      name = "u",
      descriptor = "I"
   )
   public static int field11146;
   @OriginalMember(
      owner = "client!ob",
      name = "l",
      descriptor = "J"
   )
   public long field11134;
   @OriginalMember(
      owner = "client!ob",
      name = "s",
      descriptor = "Z"
   )
   private boolean field11143;
   @OriginalMember(
      owner = "client!ob",
      name = "n",
      descriptor = "[I"
   )
   private int[] field11142;
   @OriginalMember(
      owner = "client!ob",
      name = "x",
      descriptor = "[Lua;"
   )
   public class696[] field11132;

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(Ljava/lang/String;B)I"
   )
   public final int method5522(String arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field11135;
         if (arg1 <= 5) {
            return -45;
         } else {
            int var4 = 0;
            if (var3) {
               if (this.field11132[var4].field10164.equalsIgnoreCase(arg0)) {
                  return var4;
               }

               ++var4;
            }

            while(true) {
               while(var4 < this.field11137) {
                  if (this.field11132[var4].field10164.equalsIgnoreCase(arg0)) {
                     return var4;
                  }

                  ++var4;
               }

               if (!var3) {
                  return -1;
               }

               if (-1 != 0) {
                  return var4;
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field11147[4] + (arg0 != null ? field11147[3] : field11147[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "b",
      descriptor = "(I)[I"
   )
   public final int[] method5523(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field11136;
         if (this.field11142 == null) {
            this.field11142 = new int[this.field11137];
            String[] var3 = new String[this.field11137];
            int var4 = 0;
            if (var2) {
               var3[var4] = this.field11132[var4].field10164;
               this.field11142[var4] = var4++;
            }

            while(true) {
               while(~this.field11137 < ~var4) {
                  var3[var4] = this.field11132[var4].field10164;
                  this.field11142[var4] = var4++;
               }

               if (!var2) {
                  class396.method3012((byte)-97, this.field11142, var3);
                  break;
               }

               ++var4;
            }
         }

         if (arg0 != 0) {
            this.field11132 = null;
         }

         return this.field11142;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field11147[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(IZ)V"
   )
   private final void method5524(int arg0, boolean arg1) {
      try {
         label20: {
            ++field11131;
            if (this.field11132 != null) {
               class714.method5193(this.field11132, 0, this.field11132 = new class696[arg0], 0, this.field11137);
               if (!client.field4273) {
                  break label20;
               }
            }

            this.field11132 = new class696[arg0];
         }

         if (!arg1) {
            this.method5523(-107);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11147[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(Lwm;I)V"
   )
   private final void method5525(class594 arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field11138;
         int var4 = arg0.method4288((byte)115);
         if ((var4 & arg1) != 0) {
            this.field11143 = true;
         }

         if (~(2 & var4) != -1) {
            this.field11139 = true;
         }

         super.field6862 = arg0.method4304((byte)123);
         this.field11134 = arg0.method4304((byte)116);
         this.field11145 = arg0.method4291(-114);
         arg0.method4288((byte)91);
         this.field11140 = arg0.method4340(409855200);
         this.field11144 = arg0.method4340(409855200);
         this.field11137 = arg0.method4280(-19104);
         if (this.field11137 > 0) {
            this.field11132 = new class696[this.field11137];
            int var5 = 0;
            if (var3 || ~this.field11137 < ~var5) {
               do {
                  class696 var6 = new class696();
                  if (this.field11143) {
                     arg0.method4304((byte)123);
                  }

                  if (this.field11139) {
                     var6.field10164 = arg0.method4291(arg1 + -115);
                  }

                  var6.field10170 = arg0.method4340(arg1 + 409855199);
                  var6.field10165 = arg0.method4280(-19104);
                  this.field11132[var5] = var6;
                  ++var5;
               } while(~this.field11137 < ~var5);

            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field11147[7] + (arg0 != null ? field11147[3] : field11147[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(ILua;)V"
   )
   public final void method5526(int arg0, class696 arg1) {
      try {
         ++field11130;
         if (arg0 != 5) {
            this.field11145 = null;
         }

         if (this.field11132 == null || ~this.field11137 <= ~this.field11132.length) {
            this.method5524(this.field11137 + 5, true);
         }

         this.field11132[this.field11137++] = arg1;
         this.field11142 = null;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11147[6] + arg0 + ',' + (arg1 != null ? field11147[3] : field11147[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5527(int arg0) {
      boolean var1 = client.field4273;

      try {
         ++field11133;
         class206 var2 = class605.field8474.field2788;
         var2.method1563(11798);
         int var3 = var2.method1566(8, -12869);
         if (class741.field10800 > var3) {
            int var4 = var3;
            if (var1 || var3 < class741.field10800) {
               do {
                  class593.field8202[class691.field10093++] = class285.field3785[var4];
                  ++var4;
               } while(var4 < class741.field10800);
            }
         }

         if (~var3 < ~class741.field10800) {
            throw new RuntimeException(field11147[10]);
         } else {
            class741.field10800 = 0;
            if (arg0 == 2) {
               int var5 = 0;
               if (var1 || var3 > var5) {
                  do {
                     label99: {
                        int var6 = class285.field3785[var5];
                        class680 var7 = ((class243)class335.field4808.method1839(-121, (long)var6)).field3043;
                        int var8 = var2.method1566(1, -12869);
                        if (~var8 == -1) {
                           class285.field3785[class741.field10800++] = var6;
                           var7.field7799 = class306.field4066;
                           if (!var1) {
                              break label99;
                           }
                        }

                        int var9 = var2.method1566(2, -12869);
                        if (~var9 == -1) {
                           class285.field3785[class741.field10800++] = var6;
                           var7.field7799 = class306.field4066;
                           class404.field5683[class331.field4734++] = var6;
                           if (!var1) {
                              break label99;
                           }
                        }

                        if (~var9 == -2) {
                           class285.field3785[class741.field10800++] = var6;
                           var7.field7799 = class306.field4066;
                           int var10 = var2.method1566(3, arg0 ^ -12871);
                           var7.method4977(arg0 + -2, var10, 1);
                           int var11 = var2.method1566(1, arg0 + -12871);
                           if (~var11 != -2) {
                              break label99;
                           }

                           class404.field5683[class331.field4734++] = var6;
                           if (!var1) {
                              break label99;
                           }
                        }

                        if (var9 == 2) {
                           label70: {
                              class285.field3785[class741.field10800++] = var6;
                              var7.field7799 = class306.field4066;
                              if (var2.method1566(1, arg0 + -12871) == 1) {
                                 int var12 = var2.method1566(3, arg0 + -12871);
                                 var7.method4977(0, var12, 2);
                                 int var13 = var2.method1566(3, -12869);
                                 var7.method4977(0, var13, 2);
                                 if (!var1) {
                                    break label70;
                                 }
                              }

                              int var14 = var2.method1566(3, -12869);
                              var7.method4977(0, var14, 0);
                           }

                           int var15 = var2.method1566(1, arg0 + -12871);
                           if (~var15 != -2) {
                              break label99;
                           }

                           class404.field5683[class331.field4734++] = var6;
                           if (!var1) {
                              break label99;
                           }
                        }

                        if (~var9 == -4) {
                           class593.field8202[class691.field10093++] = var6;
                        }
                     }

                     ++var5;
                  } while(var3 > var5);

               }
            }
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field11147[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method5528(int arg0, int arg1) {
      try {
         ++field11141;
         --this.field11137;
         if (arg0 == 311) {
            label19: {
               if (this.field11137 == 0) {
                  this.field11132 = null;
                  if (!client.field4273) {
                     break label19;
                  }
               }

               class714.method5193(this.field11132, arg1 + 1, this.field11132, arg1, -arg1 + this.field11137);
            }

            this.field11142 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11147[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "<init>",
      descriptor = "(Lwm;)V"
   )
   public class772(class594 arg0) {
      try {
         this.method5525(arg0, 1);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11147[2] + (arg0 != null ? field11147[3] : field11147[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5529(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5530(char[] arg0) {
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
            var10005 = 15;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
