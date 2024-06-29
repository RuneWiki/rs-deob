import jaclib.memory.Stream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class543 extends class473 {
   @OriginalMember(
      owner = "client!hha",
      name = "Ob",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7879 = new String[]{method4068(method4067("\u001cfVv8\\")), method4068(method4067("\u001cfVv>\\")), method4068(method4067("\u001a{[4")), method4068(method4067("\u000f \u0019v\u0007")), method4068(method4067("\u001cfVv9\\")), method4068(method4067("\u001cfVv;\\")), method4068(method4067("\u001cfVv?\\")), method4068(method4067("\u001cfVv<\\")), method4068(method4067("\u001cfVv=\\"))};
   @OriginalMember(
      owner = "client!hha",
      name = "Eb",
      descriptor = "Lgh;"
   )
   public static class572 field7871 = new class572(14, 2);
   @OriginalMember(
      owner = "client!hha",
      name = "Lb",
      descriptor = "I"
   )
   public static int field7867;
   @OriginalMember(
      owner = "client!hha",
      name = "Ib",
      descriptor = "I"
   )
   public static int field7868;
   @OriginalMember(
      owner = "client!hha",
      name = "Db",
      descriptor = "I"
   )
   public static int field7870;
   @OriginalMember(
      owner = "client!hha",
      name = "Cb",
      descriptor = "I"
   )
   public static int field7872;
   @OriginalMember(
      owner = "client!hha",
      name = "Jb",
      descriptor = "I"
   )
   public static int field7873;
   @OriginalMember(
      owner = "client!hha",
      name = "Nb",
      descriptor = "I"
   )
   public static int field7874;
   @OriginalMember(
      owner = "client!hha",
      name = "Fb",
      descriptor = "I"
   )
   public static int field7875;
   @OriginalMember(
      owner = "client!hha",
      name = "Hb",
      descriptor = "I"
   )
   public static int field7877;
   @OriginalMember(
      owner = "client!hha",
      name = "Gb",
      descriptor = "Lnq;"
   )
   public static class483 field7876;
   @OriginalMember(
      owner = "client!hha",
      name = "Mb",
      descriptor = "Lda;"
   )
   public static class66 field7869;
   @OriginalMember(
      owner = "client!hha",
      name = "Kb",
      descriptor = "Ljava/lang/String;"
   )
   public static String field7878;

   @OriginalMember(
      owner = "client!hha",
      name = "d",
      descriptor = "(IB)Z",
      line = 3
   )
   public static final boolean method4060(int arg0, byte arg1) {
      try {
         if (arg1 != -99) {
            return true;
         } else {
            ++field7877;
            return arg0 == 10 || arg0 == 11 || ~arg0 == -13;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7879[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(BF)V",
      line = 18
   )
   public final void method4061(byte arg0, float arg1) {
      try {
         ++field7873;
         int var3 = Stream.floatToRawIntBits(arg1);
         super.field6889[super.field6907++] = (byte)var3;
         super.field6889[super.field6907++] = (byte)(var3 >> 8);
         super.field6889[super.field6907++] = (byte)(var3 >> 16);
         super.field6889[super.field6907++] = (byte)(var3 >> 24);
         if (arg0 >= -35) {
            this.method4064(-48, 0.7392107F);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7879[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "b",
      descriptor = "(Luda;I)V",
      line = 35
   )
   public static final void method4062(class473 arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         if (arg1 < 58) {
            field7869 = null;
         }

         ++field7868;
         byte[] var3 = new byte[24];
         if (class538.field7829 != null) {
            try {
               int var10000;
               byte var10001;
               label85: {
                  class538.field7829.method2331(0L, true);
                  class538.field7829.method2332(var3, 0);
                  int var4 = 0;
                  if (var2) {
                     var10000 = ~var3[var4];
                     var10001 = -1;
                  } else if (~var4 <= -25) {
                     var10000 = var4;
                     var10001 = 24;
                     if (!var2) {
                        break label85;
                     }
                  } else {
                     var10000 = ~var3[var4];
                     var10001 = -1;
                  }

                  label84:
                  do {
                     while(true) {
                        if (var10000 != var10001) {
                           if (!var2) {
                              var10000 = var4;
                              var10001 = 24;
                              break;
                           }

                           ++var4;
                        } else {
                           ++var4;
                        }

                        if (~var4 <= -25) {
                           var10000 = var4;
                           var10001 = 24;
                           if (!var2) {
                              break label84;
                           }
                        } else {
                           var10000 = ~var3[var4];
                           var10001 = -1;
                        }
                     }
                  } while(var2);
               }

               if (var10000 >= var10001) {
                  throw new IOException();
               }
            } catch (Exception var7) {
               int var5 = 0;
               if (var2) {
                  var3[var5] = -1;
                  ++var5;
               }

               while(true) {
                  while(~var5 > -25) {
                     var3[var5] = -1;
                     ++var5;
                  }

                  if (!var2) {
                     break;
                  }

                  ++var5;
               }
            }
         }

         arg0.method3536(0, 24, var3, -13091);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field7879[1] + (arg0 != null ? field7879[3] : field7879[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "<init>",
      descriptor = "(I)V",
      line = 81
   )
   public class543(int arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(III)Z",
      line = 84
   )
   public static final boolean method4063(int arg0, int arg1, int arg2) {
      try {
         if (arg2 <= 33) {
            field7875 = 88;
         }

         ++field7870;
         return class28.method204(arg0, arg1, (byte)21) & class57.method647(arg0, 98, arg1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7879[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(IF)V",
      line = 95
   )
   public final void method4064(int arg0, float arg1) {
      try {
         ++field7867;
         int var3 = Stream.floatToRawIntBits(arg1);
         super.field6889[super.field6907++] = (byte)(var3 >> 24);
         if (arg0 != -788993200) {
            method4063(-71, -78, -113);
         }

         super.field6889[super.field6907++] = (byte)(var3 >> 16);
         super.field6889[super.field6907++] = (byte)(var3 >> 8);
         super.field6889[super.field6907++] = (byte)var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7879[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "i",
      descriptor = "(B)V",
      line = 114
   )
   public static void method4065(byte arg0) {
      try {
         field7876 = null;
         field7878 = null;
         if (arg0 != -72) {
            method4066(122, (int[])null, -30, 74, 60, (int[])null, true, (class628)null, 94, 27, 89, 113, -49, 16, -120);
         }

         field7869 = null;
         field7871 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7879[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(I[IIII[IZLcf;IIIIIII)I",
      line = 130
   )
   public static final int method4066(int param0, int[] param1, int param2, int param3, int param4, int[] param5, boolean param6, class628 param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4067(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4068(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
