import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class145 {
   @OriginalMember(
      owner = "client!wf",
      name = "h",
      descriptor = "Lhha;"
   )
   private class549 field1913;
   @OriginalMember(
      owner = "client!wf",
      name = "d",
      descriptor = "I"
   )
   private int field1919;
   @OriginalMember(
      owner = "client!wf",
      name = "c",
      descriptor = "I"
   )
   private int field1917;
   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "Ldia;"
   )
   private class245 field1916;
   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1923 = new String[]{method1232(method1231("?ZI_+")), method1232(method1231("&I\u000bp")), method1232(method1231("?ZIU+")), method1232(method1231("3\u0012I2~")), method1232(method1231("?ZIZ+")), method1232(method1231("?ZIY+")), method1232(method1231("?ZIX+")), method1232(method1231("?ZIV+")), method1232(method1231(";\u0002\u0004o")), method1232(method1231("?ZIT+")), method1232(method1231("?ZI j&U\u0013\"+")), method1232(method1231("?ZIW+")), method1232(method1231("?ZI]+")), method1232(method1231("?ZI[+")), method1232(method1231("?ZI^+"))};
   @OriginalMember(
      owner = "client!wf",
      name = "m",
      descriptor = "Lbga;"
   )
   public static class378 field1911 = new class378(125, 0);
   @OriginalMember(
      owner = "client!wf",
      name = "j",
      descriptor = "I"
   )
   public static int field1908;
   @OriginalMember(
      owner = "client!wf",
      name = "o",
      descriptor = "I"
   )
   public static int field1909;
   @OriginalMember(
      owner = "client!wf",
      name = "e",
      descriptor = "I"
   )
   public static int field1910;
   @OriginalMember(
      owner = "client!wf",
      name = "i",
      descriptor = "I"
   )
   public static int field1912;
   @OriginalMember(
      owner = "client!wf",
      name = "f",
      descriptor = "I"
   )
   public static int field1914;
   @OriginalMember(
      owner = "client!wf",
      name = "g",
      descriptor = "I"
   )
   public static int field1915;
   @OriginalMember(
      owner = "client!wf",
      name = "b",
      descriptor = "I"
   )
   public static int field1918;
   @OriginalMember(
      owner = "client!wf",
      name = "k",
      descriptor = "I"
   )
   public static int field1920;
   @OriginalMember(
      owner = "client!wf",
      name = "n",
      descriptor = "I"
   )
   public static int field1921;
   @OriginalMember(
      owner = "client!wf",
      name = "l",
      descriptor = "I"
   )
   public static int field1922;

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(ILli;Ljava/lang/Object;I)V"
   )
   private final void method1220(int param1, class455 param2, Object param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wf",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1221(int arg0) {
      try {
         if (arg0 != -1) {
            this.field1913 = null;
         }

         ++field1918;
         this.field1913.method3970(-47);
         this.field1916.method1851(120);
         this.field1919 = this.field1917;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1923[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method1222(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(ILac;)V"
   )
   private final void method1223(int arg0, class570 arg1) {
      try {
         if (arg0 != 0) {
            this.method1221(72);
         }

         if (arg1 != null) {
            arg1.method3609(92);
            arg1.method3943(-4);
            this.field1919 += arg1.field7861;
         }

         ++field1915;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1923[14] + arg0 + ',' + (arg1 != null ? field1923[3] : field1923[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method1224(int arg0) {
      try {
         if (arg0 != 0) {
            this.method1220(101, (class455)null, (Object)null, 14);
         }

         ++field1909;
         return this.field1919;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1923[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1225(int arg0) {
      try {
         ++field1921;
         if (arg0 <= 40) {
            this.method1223(-52, (class570)null);
         }

         return this.field1917;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1923[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(ILli;Ljava/lang/Object;)V"
   )
   public final void method1226(int arg0, class455 arg1, Object arg2) {
      try {
         ++field1914;
         if (arg0 != 26255) {
            field1911 = null;
         }

         this.method1220(-117, arg1, arg2, 1);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1923[5] + arg0 + ',' + (arg1 != null ? field1923[3] : field1923[1]) + ',' + (arg2 != null ? field1923[3] : field1923[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(BLli;)Ljava/lang/Object;"
   )
   public final Object method1227(byte arg0, class455 arg1) {
      boolean var3 = client.field4273;

      try {
         ++field1908;
         long var4 = arg1.method1383((byte)114);
         if (arg0 > -121) {
            this.method1222(6);
         }

         class570 var6;
         Object var7;
         label69: {
            var6 = (class570)this.field1916.method1839(-114, var4);
            if (var3) {
               if (var6.field7859.method1382(-70, arg1)) {
                  var7 = var6.method1079((byte)-85);
                  if (var7 != null) {
                     break label69;
                  }

                  var6.method3609(125);
                  var6.method3943(-4);
                  this.field1919 += var6.field7861;
                  if (var3) {
                     break label69;
                  }
               }

               var6 = (class570)this.field1916.method1844(false);
            }

            label68:
            while(true) {
               while(var6 != null) {
                  if (var6.field7859.method1382(-70, arg1)) {
                     var7 = var6.method1079((byte)-85);
                     if (var7 != null) {
                        break label68;
                     }

                     var6.method3609(125);
                     var6.method3943(-4);
                     this.field1919 += var6.field7861;
                     if (var3) {
                        break label68;
                     }
                  }

                  var6 = (class570)this.field1916.method1844(false);
               }

               if (!var3) {
                  return null;
               }

               var6 = (class570)this.field1916.method1844(false);
            }
         }

         if (var6.method1078(100)) {
            class667 var8 = new class667(arg1, var7, var6.field7861);
            this.field1916.method1841(var6.field6862, true, var8);
            this.field1913.method3968(var8, (byte)118);
            var8.field7452 = 0L;
            var6.method3609(121);
            var6.method3943(-4);
            if (!var3) {
               return var7;
            }
         }

         this.field1913.method3968(var6, (byte)127);
         var6.field7452 = 0L;
         return var7;
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field1923[6] + arg0 + ',' + (arg1 != null ? field1923[3] : field1923[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(Lli;I)V"
   )
   private final void method1228(class455 arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field1910;
         long var4 = arg0.method1383((byte)78);
         class570 var6 = (class570)this.field1916.method1839(79, var4);
         int var10000;
         if (var3) {
            var10000 = var6.field7859.method1382(125, arg0);
         } else if (var6 == null) {
            var10000 = arg1;
            if (!var3) {
               if (arg1 < 98) {
                  method1229((byte)44);
                  return;
               }

               return;
            }
         } else {
            var10000 = var6.field7859.method1382(125, arg0);
         }

         do {
            while(true) {
               if (var10000 != 0) {
                  this.method1223(0, var6);
                  if (!var3) {
                     var10000 = arg1;
                     break;
                  }

                  var6 = (class570)this.field1916.method1844(false);
               } else {
                  var6 = (class570)this.field1916.method1844(false);
               }

               if (var6 == null) {
                  var10000 = arg1;
                  if (!var3) {
                     if (arg1 < 98) {
                        method1229((byte)44);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = var6.field7859.method1382(125, arg0);
               }
            }
         } while(var3);

         if (arg1 < 98) {
            method1229((byte)44);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field1923[2] + (arg0 != null ? field1923[3] : field1923[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1229(byte arg0) {
      try {
         if (arg0 != 16) {
            field1911 = null;
         }

         field1911 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1923[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method1230(byte param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wf",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class145(int arg0) {
      boolean var2 = client.field4273;
      super();
      this.field1913 = new class549();

      try {
         this.field1919 = arg0;
         this.field1917 = arg0;
         int var3 = 1;
         if (var2) {
            var3 += var3;
         }

         while(~arg0 < ~(var3 + var3)) {
            var3 += var3;
         }

         this.field1916 = new class245(var3);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1923[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1231(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1232(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
