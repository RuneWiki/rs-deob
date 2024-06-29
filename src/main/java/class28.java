import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class28 extends class305 {
   @OriginalMember(
      owner = "client!ir",
      name = "x",
      descriptor = "I"
   )
   public int field418 = -1;
   @OriginalMember(
      owner = "client!ir",
      name = "D",
      descriptor = "I"
   )
   public int field424 = 12800;
   @OriginalMember(
      owner = "client!ir",
      name = "M",
      descriptor = "I"
   )
   public int field419 = -1;
   @OriginalMember(
      owner = "client!ir",
      name = "N",
      descriptor = "Z"
   )
   public boolean field427 = true;
   @OriginalMember(
      owner = "client!ir",
      name = "Q",
      descriptor = "I"
   )
   public int field428 = 12800;
   @OriginalMember(
      owner = "client!ir",
      name = "J",
      descriptor = "I"
   )
   public int field414 = 0;
   @OriginalMember(
      owner = "client!ir",
      name = "B",
      descriptor = "I"
   )
   public int field431 = 0;
   @OriginalMember(
      owner = "client!ir",
      name = "P",
      descriptor = "I"
   )
   public int field417;
   @OriginalMember(
      owner = "client!ir",
      name = "L",
      descriptor = "I"
   )
   public int field416;
   @OriginalMember(
      owner = "client!ir",
      name = "y",
      descriptor = "Ljava/lang/String;"
   )
   public String field434;
   @OriginalMember(
      owner = "client!ir",
      name = "C",
      descriptor = "Ljava/lang/String;"
   )
   public String field423;
   @OriginalMember(
      owner = "client!ir",
      name = "G",
      descriptor = "Liw;"
   )
   public class332 field432;
   @OriginalMember(
      owner = "client!ir",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field436 = new String[]{method206(method205("W\"D}")), method206(method205("By\u0006?z")), method206(method205("P%\u0006-nW>\\//")), method206(method205("P%\u0006S/")), method206(method205("P%\u0006P/")), method206(method205("P%\u0006V/")), method206(method205("P1\u0019")), method206(method205("P%\u0006W/")), method206(method205("P%\u0006T/")), method206(method205("P%\u0006U/")), method206(method205("P%\u0006Y/")), method206(method205("P%\u0006R/"))};
   @OriginalMember(
      owner = "client!ir",
      name = "R",
      descriptor = "Z"
   )
   public static boolean field429 = false;
   @OriginalMember(
      owner = "client!ir",
      name = "S",
      descriptor = "Lgw;"
   )
   public static class179 field415 = new class179(64);
   @OriginalMember(
      owner = "client!ir",
      name = "H",
      descriptor = "Luw;"
   )
   public static class435 field433 = new class435(50, 8);
   @OriginalMember(
      owner = "client!ir",
      name = "w",
      descriptor = "Z"
   )
   public static boolean field435 = false;
   @OriginalMember(
      owner = "client!ir",
      name = "I",
      descriptor = "I"
   )
   public static int field413;
   @OriginalMember(
      owner = "client!ir",
      name = "A",
      descriptor = "I"
   )
   public static int field420;
   @OriginalMember(
      owner = "client!ir",
      name = "K",
      descriptor = "I"
   )
   public static int field421;
   @OriginalMember(
      owner = "client!ir",
      name = "v",
      descriptor = "I"
   )
   public static int field422;
   @OriginalMember(
      owner = "client!ir",
      name = "z",
      descriptor = "I"
   )
   public static int field425;
   @OriginalMember(
      owner = "client!ir",
      name = "F",
      descriptor = "I"
   )
   public static int field426;
   @OriginalMember(
      owner = "client!ir",
      name = "E",
      descriptor = "I"
   )
   public static int field430;

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "([IIIB)Z"
   )
   public final boolean method197(int[] arg0, int arg1, int arg2, byte arg3) {
      boolean var5 = client.field4564;

      try {
         ++field422;
         class359 var6 = (class359)this.field432.method2579(-801);
         if (var5) {
            if (var6.method2822(arg1, arg2, (byte)52)) {
               var6.method2820(arg2, arg1, arg0, -124);
               return true;
            }

            var6 = (class359)this.field432.method2583(1);
         }

         while(true) {
            boolean var10000;
            if (var6 == null) {
               int var7 = 88 % ((54 - arg3) / 52);
               var10000 = false;
               if (!var5) {
                  return false;
               }
            } else {
               var10000 = var6.method2822(arg1, arg2, (byte)52);
            }

            if (var10000) {
               var6.method2820(arg2, arg1, arg0, -124);
               return true;
            }

            var6 = (class359)this.field432.method2583(1);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field436[3] + (arg0 != null ? field436[1] : field436[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method198(int arg0) {
      try {
         field415 = null;
         if (arg0 != -27668) {
            field429 = true;
         }

         field433 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field436[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method199(int arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field413;
         if (class482.field7007[arg1]) {
            return true;
         } else if (!class331.field4737.method1342(arg1, (byte)-57)) {
            return false;
         } else {
            int var3 = class331.field4737.method1346(arg1, arg0);
            if (~var3 == -1) {
               class482.field7007[arg1] = true;
               return true;
            } else {
               if (class253.field3608[arg1] == null) {
                  class253.field3608[arg1] = new class303[var3];
               }

               int var4 = arg0;
               byte[] var5;
               class303 var6;
               if (var2) {
                  if (class253.field3608[arg1][arg0] == null) {
                     var5 = class331.field4737.method1347((byte)122, arg1, arg0);
                     if (var5 != null) {
                        var6 = class253.field3608[arg1][arg0] = new class303();
                        var6.field4263 = (arg1 << 16) - -arg0;
                        if (~var5[0] != 0) {
                           throw new IllegalStateException(field436[6]);
                        }

                        var6.method2358(-1, new class473(var5));
                     }
                  }

                  var4 = arg0 + 1;
               }

               while(true) {
                  while(~var4 > ~var3) {
                     if (class253.field3608[arg1][var4] == null) {
                        var5 = class331.field4737.method1347((byte)122, arg1, var4);
                        if (var5 != null) {
                           var6 = class253.field3608[arg1][var4] = new class303();
                           var6.field4263 = (arg1 << 16) - -var4;
                           if (~var5[0] != 0) {
                              throw new IllegalStateException(field436[6]);
                           }

                           var6.method2358(-1, new class473(var5));
                        }
                     }

                     ++var4;
                  }

                  class482.field7007[arg1] = true;
                  if (!var2) {
                     return true;
                  }

                  ++var4;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field436[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(IIB[I)Z"
   )
   public final boolean method200(int arg0, int arg1, byte arg2, int[] arg3) {
      boolean var5 = client.field4564;

      try {
         ++field425;
         int var6 = 38 / ((69 - arg2) / 55);
         class359 var7 = (class359)this.field432.method2579(-801);
         boolean var10000;
         if (var5) {
            var10000 = var7.method2825(arg0, false, arg1);
         } else if (var7 == null) {
            var10000 = false;
            if (!var5) {
               return false;
            }
         } else {
            var10000 = var7.method2825(arg0, false, arg1);
         }

         while(!var10000) {
            var7 = (class359)this.field432.method2583(1);
            if (var7 == null) {
               var10000 = false;
               if (!var5) {
                  return false;
               }
            } else {
               var10000 = var7.method2825(arg0, false, arg1);
            }
         }

         var7.method2824(arg0, arg3, 1, arg1);
         return true;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field436[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field436[1] : field436[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(IIIB[I)Z"
   )
   public final boolean method201(int arg0, int arg1, int arg2, byte arg3, int[] arg4) {
      boolean var6 = client.field4564;

      try {
         ++field420;
         if (arg3 > -15) {
            this.field414 = -120;
         }

         class359 var7 = (class359)this.field432.method2579(-801);
         boolean var10000;
         if (var6) {
            var10000 = var7.method2821(-125, arg2, arg1, arg0);
         } else if (var7 == null) {
            var10000 = false;
            if (!var6) {
               return false;
            }
         } else {
            var10000 = var7.method2821(-125, arg2, arg1, arg0);
         }

         while(!var10000) {
            var7 = (class359)this.field432.method2583(1);
            if (var7 == null) {
               var10000 = false;
               if (!var6) {
                  return false;
               }
            } else {
               var10000 = var7.method2821(-125, arg2, arg1, arg0);
            }
         }

         var7.method2824(arg2, arg4, 1, arg0);
         return true;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field436[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field436[1] : field436[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public final boolean method202(int arg0, byte arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         ++field430;
         if (arg1 < 88) {
            method204(-109, -58, (byte)-93);
         }

         class359 var5 = (class359)this.field432.method2579(-801);
         if (var4) {
            if (var5.method2825(arg2, false, arg0)) {
               return true;
            }

            var5 = (class359)this.field432.method2583(1);
         }

         while(true) {
            boolean var10000;
            if (var5 == null) {
               var10000 = false;
               if (!var4) {
                  return false;
               }
            } else {
               var10000 = var5.method2825(arg2, false, arg0);
            }

            if (var10000) {
               return true;
            }

            var5 = (class359)this.field432.method2583(1);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field436[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method203(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method204(int arg0, int arg1, byte arg2) {
      try {
         ++field421;
         if (arg2 != 21) {
            method199(57, -24);
         }

         return false;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field436[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "<init>",
      descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V"
   )
   public class28(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
      try {
         this.field417 = arg3;
         this.field416 = arg0;
         this.field419 = arg4;
         this.field434 = arg1;
         this.field418 = arg6;
         this.field427 = arg5;
         this.field423 = arg2;
         if (~this.field418 == -256) {
            this.field418 = 0;
         }

         this.field432 = new class332();
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field436[2] + arg0 + ',' + (arg1 != null ? field436[1] : field436[0]) + ',' + (arg2 != null ? field436[1] : field436[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method205(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ir",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method206(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
