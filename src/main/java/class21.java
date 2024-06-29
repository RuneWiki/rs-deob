import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class21 {
   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "Lsia;"
   )
   private class407 field322 = new class407(64);
   @OriginalMember(
      owner = "client!ea",
      name = "k",
      descriptor = "Lww;"
   )
   private class339 field321;
   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field334 = new String[]{method168(method167("\u0017M`Jz")), method168(method167("\u0017M`Oz")), method168(method167("\u001cY\"d")), method168(method167("\t\u0002`&/")), method168(method167("\u0017M`Kz")), method168(method167("\u0017M`4;\u001cE:6z")), method168(method167("\u0017M`Iz")), method168(method167("\u0017M`Nz")), method168(method167("\u0017M`Mz")), method168(method167("\u0017M`@z")), method168(method167("\u0017M`Lz")), method168(method167(";B8i>\u001bHnz3\u0016E62"))};
   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "Ldp;"
   )
   public static class499 field327 = new class499(9, 2);
   @OriginalMember(
      owner = "client!ea",
      name = "h",
      descriptor = "[[I"
   )
   public static int[][] field332 = new int[][]{{0, 1, 2, 3}, {1, 2, 3, 0}, {1, 2, -1, 0}, {2, 0, -1, 1}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 1, 3, -1}, {-1, 0, 2, -1}, {3, 5, 2, 0}, {0, 2, 5, 3}, {0, 2, 3, 5}, {0, 1, 2, 3}};
   @OriginalMember(
      owner = "client!ea",
      name = "f",
      descriptor = "Lse;"
   )
   public static class6 field333 = new class6(81, -1);
   @OriginalMember(
      owner = "client!ea",
      name = "c",
      descriptor = "D"
   )
   public static double field331;
   @OriginalMember(
      owner = "client!ea",
      name = "j",
      descriptor = "I"
   )
   public static int field323;
   @OriginalMember(
      owner = "client!ea",
      name = "g",
      descriptor = "I"
   )
   public static int field324;
   @OriginalMember(
      owner = "client!ea",
      name = "l",
      descriptor = "I"
   )
   public static int field325;
   @OriginalMember(
      owner = "client!ea",
      name = "m",
      descriptor = "I"
   )
   public static int field326;
   @OriginalMember(
      owner = "client!ea",
      name = "i",
      descriptor = "I"
   )
   public static int field328;
   @OriginalMember(
      owner = "client!ea",
      name = "d",
      descriptor = "I"
   )
   public static int field329;
   @OriginalMember(
      owner = "client!ea",
      name = "e",
      descriptor = "I"
   )
   public static int field330;

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method159(int arg0) {
      try {
         class407 var2 = this.field322;
         synchronized(this.field322) {
            int var3 = 108 / ((arg0 - -62) / 59);
            this.field322.method3187(-23825);
         }

         ++field323;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field334[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(BI)Lcs;"
   )
   public final class635 method160(byte arg0, int arg1) {
      try {
         ++field329;
         class407 var3 = this.field322;
         class635 var4;
         synchronized(this.field322) {
            var4 = (class635)this.field322.method3192((long)arg1, (byte)-119);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field321;
            byte[] var6;
            synchronized(this.field321) {
               var6 = this.field321.method2697(arg1, 54, false);
            }

            class635 var7 = new class635();
            if (var6 != null) {
               var7.method4676((byte)-127, new class66(var6));
            }

            class407 var8 = this.field322;
            synchronized(this.field322) {
               this.field322.method3190(var7, (long)arg1, 8);
               if (arg0 != 47) {
                  this.method161(21, 96);
               }

               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field334[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method161(int arg0, int arg1) {
      try {
         ++field330;
         if (arg0 <= 91) {
            field327 = null;
         }

         class407 var3 = this.field322;
         synchronized(this.field322) {
            this.field322.method3197(5, arg1);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field334[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(B)Lfv;"
   )
   public static final class702 method162(byte arg0) {
      try {
         ++field326;
         if (arg0 <= 17) {
            return null;
         } else {
            class702 var1 = class732.method5291(119);
            var1.field10266 = 0;
            var1.field10269 = null;
            var1.field10264 = new class431(5000);
            return var1;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field334[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IIILpf;B)Z"
   )
   public static final boolean method163(int arg0, int arg1, int arg2, class30 arg3, byte arg4) {
      try {
         int var5 = -9 / ((-27 - arg4) / 48);
         ++field328;
         if (class613.field9018 && class78.field1042) {
            if (class516.field7237 < 100) {
               return false;
            } else if (!class725.method5252(arg0, arg1, arg2, -1)) {
               return false;
            } else {
               int var6 = arg2 << class783.field11447;
               int var7 = arg0 << class783.field11447;
               int var8 = -1 + class659.field9815[arg1].method3284(-1, arg2, arg0);
               int var9 = arg3.method76((byte)21) + var8;
               if (~arg3.field436 == -2) {
                  if (!class281.method2217(var9, var6, class15.field276 + var7, var7, var6, var9, var7, var8, (byte)67, var6)) {
                     return false;
                  } else if (!class281.method2217(var8, var6, class15.field276 + var7, var7, var6, var9, class15.field276 + var7, var8, (byte)67, var6)) {
                     return false;
                  } else {
                     ++class26.field399;
                     return true;
                  }
               } else if (arg3.field436 == 2) {
                  if (!class281.method2217(var9, var6, class15.field276 + var7, class15.field276 + var7, class15.field276 + var6, var9, class15.field276 + var7, var8, (byte)67, var6)) {
                     return false;
                  } else if (!class281.method2217(var9, var6 - -class15.field276, class15.field276 + var7, class15.field276 + var7, class15.field276 + var6, var8, class15.field276 + var7, var8, (byte)67, var6)) {
                     return false;
                  } else {
                     ++class26.field399;
                     return true;
                  }
               } else if (~arg3.field436 == -5) {
                  if (!class281.method2217(var9, class15.field276 + var6, class15.field276 + var7, var7, class15.field276 + var6, var9, var7, var8, (byte)67, class15.field276 + var6)) {
                     return false;
                  } else if (!class281.method2217(var8, class15.field276 + var6, class15.field276 + var7, var7, class15.field276 + var6, var9, class15.field276 + var7, var8, (byte)67, class15.field276 + var6)) {
                     return false;
                  } else {
                     ++class26.field399;
                     return true;
                  }
               } else if (~arg3.field436 == -9) {
                  if (!class281.method2217(var9, var6, var7, var7, var6 - -class15.field276, var9, var7, var8, (byte)67, var6)) {
                     return false;
                  } else if (!class281.method2217(var9, var6 - -class15.field276, var7, var7, class15.field276 + var6, var8, var7, var8, (byte)67, var6)) {
                     return false;
                  } else {
                     ++class26.field399;
                     return true;
                  }
               } else if (~arg3.field436 == -17) {
                  if (!class280.method2205(var7 - -class486.field6788, -127, var9, class486.field6788, var6, var8, class486.field6788)) {
                     return false;
                  } else {
                     ++class26.field399;
                     return true;
                  }
               } else if (arg3.field436 == 32) {
                  if (!class280.method2205(class486.field6788 + var7, -122, var9, class486.field6788, var6 - -class486.field6788, var8, class486.field6788)) {
                     return false;
                  } else {
                     ++class26.field399;
                     return true;
                  }
               } else if (arg3.field436 == 64) {
                  if (!class280.method2205(var7, -109, var9, class486.field6788, class486.field6788 + var6, var8, class486.field6788)) {
                     return false;
                  } else {
                     ++class26.field399;
                     return true;
                  }
               } else if (arg3.field436 == 128) {
                  if (!class280.method2205(var7, -111, var9, class486.field6788, var6, var8, class486.field6788)) {
                     return false;
                  } else {
                     ++class26.field399;
                     return true;
                  }
               } else {
                  return true;
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field334[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field334[3] : field334[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method164(byte arg0) {
      try {
         class407 var2 = this.field322;
         synchronized(this.field322) {
            this.field322.method3201((byte)92);
            int var3 = 64 % ((arg0 - -71) / 52);
         }

         ++field324;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field334[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Ljava/lang/String;ZZI)I"
   )
   public static final int method165(String arg0, boolean arg1, boolean arg2, int arg3) {
      boolean var4 = client.field1481;

      try {
         ++field325;
         if (~arg3 <= -3 && ~arg3 >= -37) {
            boolean var5 = false;
            byte var6 = arg2;
            int var7 = 0;
            int var8 = arg0.length();
            int var9 = 0;
            char var10000;
            if (var4) {
               var10000 = arg0.charAt(var9);
            } else if (~var9 <= ~var8) {
               var10000 = (char)arg2;
               if (!var4) {
                  if (arg2 == 0) {
                     throw new NumberFormatException();
                  }

                  return var7;
               }
            } else {
               var10000 = arg0.charAt(var9);
            }

            while(true) {
               label166: {
                  int var10 = var10000;
                  if (~var9 == -1) {
                     if (var10 == 45) {
                        var5 = true;
                        if (!var4) {
                           ++var9;
                           break label166;
                        }
                     }

                     if (var10 == 43 && arg1 && !var4) {
                        ++var9;
                        break label166;
                     }
                  }

                  int var11;
                  if (var10 >= 48 && ~var10 >= -58) {
                     var10 -= 48;
                     if (!var4) {
                        if (var10 >= arg3) {
                           throw new NumberFormatException();
                        }

                        if (var5) {
                           var10 = -var10;
                        }

                        var11 = arg3 * var7 + var10;
                        if (var11 / arg3 != var7) {
                           throw new NumberFormatException();
                        }

                        var7 = var11;
                        var6 = 1;
                        ++var9;
                        break label166;
                     }
                  }

                  if (~var10 <= -66) {
                     if (var10 > 90) {
                        if (var10 < 97 || var10 > 122) {
                           break;
                        }

                        var10 -= 87;
                        if (var4) {
                           var10 -= 55;
                        }
                     } else {
                        var10 -= 55;
                     }
                  } else {
                     if (var10 < 97 || var10 > 122) {
                        break;
                     }

                     var10 -= 87;
                     if (var4) {
                        var10 -= 55;
                     }
                  }

                  if (var10 >= arg3) {
                     throw new NumberFormatException();
                  }

                  if (var5) {
                     var10 = -var10;
                  }

                  var11 = arg3 * var7 + var10;
                  if (var11 / arg3 != var7) {
                     throw new NumberFormatException();
                  }

                  var7 = var11;
                  var6 = 1;
                  ++var9;
               }

               if (~var9 <= ~var8) {
                  var10000 = (char)var6;
                  if (!var4) {
                     if (var6 == 0) {
                        throw new NumberFormatException();
                     }

                     return var7;
                  }
               } else {
                  var10000 = arg0.charAt(var9);
               }
            }

            throw new NumberFormatException();
         } else {
            throw new IllegalArgumentException(field334[11] + arg3);
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field334[10] + (arg0 != null ? field334[3] : field334[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method166(boolean arg0) {
      try {
         if (!arg0) {
            field333 = null;
         }

         field333 = null;
         field332 = null;
         field327 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field334[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class21(class500 arg0, int arg1, class339 arg2) {
      try {
         this.field321 = arg2;
         if (this.field321 != null) {
            this.field321.method2691(54, -65);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field334[5] + (arg0 != null ? field334[3] : field334[2]) + ',' + arg1 + ',' + (arg2 != null ? field334[3] : field334[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method167(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method168(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
