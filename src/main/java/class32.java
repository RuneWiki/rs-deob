import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class32 {
   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "Z"
   )
   public boolean field480 = true;
   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field483 = new String[]{method262(method261("\u0001q<X\u0004")), method262(method261("\u0015)<0Q")), method262(method261(")7s\u0012\u001c\b\u007f~\u001f\u0017\u00116|\u0011Y\u001c>{\u001a\u001c\u001ee")), method262(method261("\u0014*~\u001a")), method262(method261("\u0015)<2Q")), method262(method261("\u0015)<3Q")), method262(method261("\u0015)<5Q")), method262(method261("&p<LUZ\u0000?]\"'!R")), method262(method261("\n>g\u0005\u001c")), method262(method261("*>g\u0005\u0010\u001482\u0010\u0016\b\u007f")), method262(method261("Z,w\u0015\u0016\u0014;aXWT")), method262(method261("\u0015)<4Q")), method262(method261("\u0015)<7Q"))};
   @OriginalMember(
      owner = "client!ov",
      name = "m",
      descriptor = "Laka;"
   )
   public static class418 field471 = new class418(29, -1);
   @OriginalMember(
      owner = "client!ov",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field478 = new int[]{0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4};
   @OriginalMember(
      owner = "client!ov",
      name = "f",
      descriptor = "I"
   )
   public static int field474 = -1;
   @OriginalMember(
      owner = "client!ov",
      name = "i",
      descriptor = "[[I"
   )
   public static int[][] field482 = new int[][]{{2, 4, 6, 0}, {0, 2, 4, 6}, {0, 2, 4}, {4, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 4, 7, 6}, {4, 7, 6, 0}, {0, 8, 6, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 4, 6, 10, 0}, {2, 4, 6, 0}};
   @OriginalMember(
      owner = "client!ov",
      name = "g",
      descriptor = "C"
   )
   private char field472;
   @OriginalMember(
      owner = "client!ov",
      name = "p",
      descriptor = "D"
   )
   public static double field481;
   @OriginalMember(
      owner = "client!ov",
      name = "n",
      descriptor = "I"
   )
   public int field466;
   @OriginalMember(
      owner = "client!ov",
      name = "e",
      descriptor = "I"
   )
   public static int field467;
   @OriginalMember(
      owner = "client!ov",
      name = "d",
      descriptor = "I"
   )
   public static int field469;
   @OriginalMember(
      owner = "client!ov",
      name = "l",
      descriptor = "I"
   )
   public static int field473;
   @OriginalMember(
      owner = "client!ov",
      name = "k",
      descriptor = "I"
   )
   public static int field475;
   @OriginalMember(
      owner = "client!ov",
      name = "j",
      descriptor = "I"
   )
   public static int field477;
   @OriginalMember(
      owner = "client!ov",
      name = "q",
      descriptor = "I"
   )
   public static int field479;
   @OriginalMember(
      owner = "client!ov",
      name = "b",
      descriptor = "J"
   )
   public static long field468;
   @OriginalMember(
      owner = "client!ov",
      name = "c",
      descriptor = "Lul;"
   )
   public static class491 field476;
   @OriginalMember(
      owner = "client!ov",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   public String field470;

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method255(int arg0) {
      try {
         if (arg0 != -29281) {
            field478 = null;
         }

         ++field479;
         return ~this.field472 == -116;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field483[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method256(byte arg0) {
      try {
         field476 = null;
         if (arg0 >= -51) {
            field474 = -57;
         }

         field478 = null;
         field471 = null;
         field482 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field483[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(IILgea;)V"
   )
   private final void method257(int arg0, int arg1, class66 arg2) {
      boolean var4 = client.field1481;

      try {
         label46: {
            if (arg1 != 1) {
               if (~arg1 == -3) {
                  this.field466 = arg2.method610(arg0 ^ -84);
                  if (!var4) {
                     break label46;
                  }
               }

               if (~arg1 == -5) {
                  this.field480 = false;
                  if (!var4) {
                     break label46;
                  }
               }

               if (~arg1 != -6) {
                  break label46;
               }

               this.field470 = arg2.method606(arg0 ^ 11856);
               if (!var4) {
                  break label46;
               }
            }

            this.field472 = class123.method1076(arg2.method628((byte)-12), -25094);
         }

         if (arg0 == 0) {
            ++field477;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field483[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field483[0] : field483[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method258(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(Lgea;Z)V"
   )
   public final void method259(class66 arg0, boolean arg1) {
      boolean var3 = client.field1481;

      try {
         ++field467;
         if (!arg1) {
            field478 = null;
         }

         do {
            int var4 = arg0.method640(255);
            if (~var4 == -1) {
               break;
            }

            this.method257(0, var4, arg0);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class93.method866(var6, field483[11] + (arg0 != null ? field483[0] : field483[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(I[Lld;Llea;)Lafa;"
   )
   public static final class215 method260(int arg0, class128[] arg1, class574 arg2) {
      boolean var3 = client.field1481;

      try {
         ++field473;
         int var4 = 0;
         if (var3) {
            if (arg1[var4] == null || ~arg1[var4].field1644 >= -1L) {
               return null;
            }

            ++var4;
         }

         while(true) {
            while(arg1.length > var4) {
               if (arg1[var4] == null || ~arg1[var4].field1644 >= -1L) {
                  return null;
               }

               ++var4;
            }

            long var5 = OpenGL.glCreateProgramObjectARB();
            if (!var3) {
               if (arg0 != 105) {
                  return null;
               }

               int var7 = 0;
               if (var3) {
                  OpenGL.glAttachObjectARB(var5, arg1[var7].field1644);
                  ++var7;
               }

               while(true) {
                  while(var7 < arg1.length) {
                     OpenGL.glAttachObjectARB(var5, arg1[var7].field1644);
                     ++var7;
                  }

                  OpenGL.glLinkProgramARB(var5);
                  OpenGL.glGetObjectParameterivARB(var5, 35714, class24.field380, 0);
                  if (!var3) {
                     if (~class24.field380[0] == -1) {
                        if (class24.field380[0] == 0) {
                           System.out.println(field483[2]);
                        }

                        OpenGL.glGetObjectParameterivARB(var5, 35716, class24.field380, 1);
                        if (class24.field380[1] > 1) {
                           byte[] var8 = new byte[class24.field380[1]];
                           OpenGL.glGetInfoLogARB(var5, class24.field380[1], class24.field380, 0, var8, 0);
                           System.out.println(new String(var8));
                        }

                        if (class24.field380[0] == 0) {
                           int var9 = 0;
                           if (var3) {
                              OpenGL.glDetachObjectARB(var5, arg1[var9].field1644);
                              ++var9;
                           }

                           while(true) {
                              while(var9 < arg1.length) {
                                 OpenGL.glDetachObjectARB(var5, arg1[var9].field1644);
                                 ++var9;
                              }

                              OpenGL.glDeleteObjectARB(var5);
                              if (!var3) {
                                 return null;
                              }

                              ++var9;
                           }
                        }
                     }

                     return new class215(arg2, var5, arg1);
                  }

                  ++var7;
               }
            }

            if (arg0 >= 0) {
               return null;
            }

            ++var4;
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field483[1] + arg0 + ',' + (arg1 != null ? field483[0] : field483[3]) + ',' + (arg2 != null ? field483[0] : field483[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method261(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method262(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
