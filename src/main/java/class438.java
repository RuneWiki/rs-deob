import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class438 {
   @OriginalMember(
      owner = "client!gm",
      name = "m",
      descriptor = "Liw;"
   )
   private class107 field6419 = new class107(64);
   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "Lsa;"
   )
   private class39 field6422;
   @OriginalMember(
      owner = "client!gm",
      name = "e",
      descriptor = "Lsa;"
   )
   public class39 field6420;
   @OriginalMember(
      owner = "client!gm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6427 = new String[]{method3416(method3415("nxURf")), method3416(method3415("nxUWf")), method3416(method3415("nxUPf")), method3416(method3415("nxU-'g|\u000f/f")), method3416(method3415("r;U?3")), method3416(method3415("g`\u0017}")), method3416(method3415("nxUUf")), method3416(method3415("nxUTf")), method3416(method3415("nxUSf")), method3416(method3415("nxUVf"))};
   @OriginalMember(
      owner = "client!gm",
      name = "k",
      descriptor = "Lhha;"
   )
   public static class724 field6415 = new class724(11, -2);
   @OriginalMember(
      owner = "client!gm",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field6425 = new int[1];
   @OriginalMember(
      owner = "client!gm",
      name = "g",
      descriptor = "I"
   )
   public static int field6414;
   @OriginalMember(
      owner = "client!gm",
      name = "j",
      descriptor = "I"
   )
   public static int field6416;
   @OriginalMember(
      owner = "client!gm",
      name = "i",
      descriptor = "I"
   )
   public static int field6417;
   @OriginalMember(
      owner = "client!gm",
      name = "h",
      descriptor = "I"
   )
   public static int field6418;
   @OriginalMember(
      owner = "client!gm",
      name = "b",
      descriptor = "I"
   )
   public static int field6421;
   @OriginalMember(
      owner = "client!gm",
      name = "c",
      descriptor = "I"
   )
   public static int field6423;
   @OriginalMember(
      owner = "client!gm",
      name = "d",
      descriptor = "I"
   )
   public static int field6424;
   @OriginalMember(
      owner = "client!gm",
      name = "f",
      descriptor = "I"
   )
   public static int field6426;

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3408(byte arg0) {
      try {
         class107 var2 = this.field6419;
         synchronized(this.field6419) {
            this.field6419.method1052(true);
         }

         ++field6418;
         if (arg0 != -57) {
            field6425 = null;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6427[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3409(int arg0) {
      try {
         field6425 = null;
         if (arg0 < -59) {
            field6415 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6427[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3410(int arg0) {
      try {
         ++field6426;
         class107 var2 = this.field6419;
         synchronized(this.field6419) {
            this.field6419.method1045(3);
            if (arg0 != -21429) {
               this.field6420 = null;
            }

         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6427[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(II[Ljga;)V"
   )
   public static final void method3411(int arg0, int arg1, class91[] arg2) {
      boolean var3 = client.field10022;

      try {
         int var4 = 0;
         if (!var3 && ~arg2.length >= ~var4) {
            if (arg1 != -31762) {
               method3409(117);
            }

            ++field6421;
         } else {
            do {
               class91 var5 = arg2[var4];
               if (var5 != null && var5.field1407 == arg0 && !client.method5053(var5)) {
                  if (var5.field1403 == 0) {
                     method3411(var5.field1356, arg1, arg2);
                     if (var5.field1373 != null) {
                        method3411(var5.field1356, -31762, var5.field1373);
                     }

                     class733 var6 = (class733)class139.field2228.method3101(arg1 ^ 31761, (long)var5.field1356);
                     if (var6 != null) {
                        class550.method4126(var6.field10417, true);
                     }
                  }

                  if (var5.field1403 == 6 && var5.field1350 != -1) {
                     if (var5.field1337 == null) {
                        var5.field1337 = new class80();
                        var5.field1337.method2207(var5.field1350, (byte)-124);
                     }

                     if (var5.field1337.method2198(class327.field4859, 65535) && var5.field1337.method2195(-90)) {
                        var5.field1337.method2192(109);
                     }
                  }
               }

               ++var4;
            } while(~arg2.length < ~var4);

            if (arg1 != -31762) {
               method3409(117);
            }

            ++field6421;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field6427[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6427[4] : field6427[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method3412(byte arg0, int arg1) {
      try {
         ++field6417;
         class107 var3 = this.field6419;
         synchronized(this.field6419) {
            this.field6419.method1048(arg1, -8543);
         }

         if (arg0 != -94) {
            field6424 = 15;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6427[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(IZ)Ltha;"
   )
   public final class296 method3413(int arg0, boolean arg1) {
      try {
         ++field6414;
         class107 var3 = this.field6419;
         class296 var4;
         synchronized(this.field6419) {
            var4 = (class296)this.field6419.method1041((long)arg0, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field6422;
            byte[] var6;
            synchronized(this.field6422) {
               var6 = this.field6422.method460((byte)-11, arg0, 3);
            }

            class296 var7 = new class296();
            var7.field4410 = this;
            if (arg1) {
               return null;
            } else {
               if (var6 != null) {
                  var7.method2471(new class65(var6), 0);
               }

               class107 var8 = this.field6419;
               synchronized(this.field6419) {
                  this.field6419.method1050(-105, var7, (long)arg0);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field6427[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(IIIIIZ)V"
   )
   public static final void method3414(int param0, int param1, int param2, int param3, int param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gm",
      name = "<init>",
      descriptor = "(Ltb;ILsa;Lsa;)V"
   )
   public class438(class392 arg0, int arg1, class39 arg2, class39 arg3) {
      try {
         this.field6422 = arg2;
         this.field6420 = arg3;
         this.field6422.method434((byte)-106, 3);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6427[3] + (arg0 != null ? field6427[4] : field6427[5]) + ',' + arg1 + ',' + (arg2 != null ? field6427[4] : field6427[5]) + ',' + (arg3 != null ? field6427[4] : field6427[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3415(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3416(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
