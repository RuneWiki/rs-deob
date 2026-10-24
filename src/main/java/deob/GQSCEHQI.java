package deob;

@ObfuscatedName("GQSCEHQI")
public class GQSCEHQI {

	@ObfuscatedName("GQSCEHQI.e")
	public int field732 = 0;

	@ObfuscatedName("GQSCEHQI.f")
	public int field733 = 0;

	@ObfuscatedName("GQSCEHQI.g")
	public int field734;

	@ObfuscatedName("GQSCEHQI.h")
	public int field735;

	@ObfuscatedName("GQSCEHQI.i")
	public int[][] field736;

	public GQSCEHQI(int arg0, int arg1) {
		field734 = arg1;
		field735 = arg0;
		field736 = new int[field734][field735];
		method213();
	}

	@ObfuscatedName("GQSCEHQI.a()V")
	public void method213() {
		for (int var1 = 0; var1 < field734; var1++) {
			for (int var2 = 0; var2 < field735; var2++) {
				if (var1 == 0 || var2 == 0 || field734 - 1 == var1 || field735 - 1 == var2) {
					field736[var1][var2] = 0xFFFFFF;
				} else {
					field736[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("GQSCEHQI.a(IBIIZI)V")
	public void method214(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg2 -= field732;
		arg0 -= field733;
		if (arg4 == 0) {
			if (arg1 == 0) {
				method217(arg2, arg0, 128);
				method217(arg2 - 1, arg0, 8);
			}

			if (arg1 == 1) {
				method217(arg2, arg0, 2);
				method217(arg2, arg0 + 1, 32);
			}

			if (arg1 == 2) {
				method217(arg2, arg0, 8);
				method217(arg2 + 1, arg0, 128);
			}

			if (arg1 == 3) {
				method217(arg2, arg0, 32);
				method217(arg2, arg0 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				method217(arg2, arg0, 1);
				method217(arg2 - 1, arg0 + 1, 16);
			}

			if (arg1 == 1) {
				method217(arg2, arg0, 4);
				method217(arg2 + 1, arg0 + 1, 64);
			}

			if (arg1 == 2) {
				method217(arg2, arg0, 16);
				method217(arg2 + 1, arg0 - 1, 1);
			}

			if (arg1 == 3) {
				method217(arg2, arg0, 64);
				method217(arg2 - 1, arg0 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				method217(arg2, arg0, 130);
				method217(arg2 - 1, arg0, 8);
				method217(arg2, arg0 + 1, 32);
			}

			if (arg1 == 1) {
				method217(arg2, arg0, 10);
				method217(arg2, arg0 + 1, 32);
				method217(arg2 + 1, arg0, 128);
			}

			if (arg1 == 2) {
				method217(arg2, arg0, 40);
				method217(arg2 + 1, arg0, 128);
				method217(arg2, arg0 - 1, 2);
			}

			if (arg1 == 3) {
				method217(arg2, arg0, 160);
				method217(arg2, arg0 - 1, 2);
				method217(arg2 - 1, arg0, 8);
			}
		}

		if (arg3) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					method217(arg2, arg0, 0x10000);
					method217(arg2 - 1, arg0, 4096);
				}

				if (arg1 == 1) {
					method217(arg2, arg0, 1024);
					method217(arg2, arg0 + 1, 16384);
				}

				if (arg1 == 2) {
					method217(arg2, arg0, 4096);
					method217(arg2 + 1, arg0, 0x10000);
				}

				if (arg1 == 3) {
					method217(arg2, arg0, 16384);
					method217(arg2, arg0 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					method217(arg2, arg0, 512);
					method217(arg2 - 1, arg0 + 1, 8192);
				}

				if (arg1 == 1) {
					method217(arg2, arg0, 2048);
					method217(arg2 + 1, arg0 + 1, 32768);
				}

				if (arg1 == 2) {
					method217(arg2, arg0, 8192);
					method217(arg2 + 1, arg0 - 1, 512);
				}

				if (arg1 == 3) {
					method217(arg2, arg0, 32768);
					method217(arg2 - 1, arg0 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg1 == 0) {
					method217(arg2, arg0, 66560);
					method217(arg2 - 1, arg0, 4096);
					method217(arg2, arg0 + 1, 16384);
				}

				if (arg1 == 1) {
					method217(arg2, arg0, 5120);
					method217(arg2, arg0 + 1, 16384);
					method217(arg2 + 1, arg0, 0x10000);
				}

				if (arg1 == 2) {
					method217(arg2, arg0, 20480);
					method217(arg2 + 1, arg0, 0x10000);
					method217(arg2, arg0 - 1, 1024);
				}

				if (arg1 == 3) {
					method217(arg2, arg0, 81920);
					method217(arg2, arg0 - 1, 1024);
					method217(arg2 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("GQSCEHQI.a(IIBIIIZ)V")
	public void method215(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg1 -= field732;
		arg2 -= field733;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg0;
			arg0 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg1; var9 < arg0 + arg1; var9++) {
			if (var9 >= 0 && var9 < field734) {
				for (int var10 = arg2; var10 < arg2 + arg3; var10++) {
					if (var10 >= 0 && var10 < field735) {
						method217(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("GQSCEHQI.a(III)V")
	public void method216(int arg0, int arg1) {
		arg0 -= field732;
		arg1 -= field733;
		field736[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("GQSCEHQI.b(III)V")
	public void method217(int arg0, int arg1, int arg2) {
		field736[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("GQSCEHQI.a(IIIZII)V")
	public void method218(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg0 -= field732;
		arg1 -= field733;
		if (arg4 == 0) {
			if (arg3 == 0) {
				method220(arg1, 128, arg0);
				method220(arg1, 8, arg0 - 1);
			}

			if (arg3 == 1) {
				method220(arg1, 2, arg0);
				method220(arg1 + 1, 32, arg0);
			}

			if (arg3 == 2) {
				method220(arg1, 8, arg0);
				method220(arg1, 128, arg0 + 1);
			}

			if (arg3 == 3) {
				method220(arg1, 32, arg0);
				method220(arg1 - 1, 2, arg0);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				method220(arg1, 1, arg0);
				method220(arg1 + 1, 16, arg0 - 1);
			}

			if (arg3 == 1) {
				method220(arg1, 4, arg0);
				method220(arg1 + 1, 64, arg0 + 1);
			}

			if (arg3 == 2) {
				method220(arg1, 16, arg0);
				method220(arg1 - 1, 1, arg0 + 1);
			}

			if (arg3 == 3) {
				method220(arg1, 64, arg0);
				method220(arg1 - 1, 4, arg0 - 1);
			}
		}

		if (arg4 == 2) {
			if (arg3 == 0) {
				method220(arg1, 130, arg0);
				method220(arg1, 8, arg0 - 1);
				method220(arg1 + 1, 32, arg0);
			}

			if (arg3 == 1) {
				method220(arg1, 10, arg0);
				method220(arg1 + 1, 32, arg0);
				method220(arg1, 128, arg0 + 1);
			}

			if (arg3 == 2) {
				method220(arg1, 40, arg0);
				method220(arg1, 128, arg0 + 1);
				method220(arg1 - 1, 2, arg0);
			}

			if (arg3 == 3) {
				method220(arg1, 160, arg0);
				method220(arg1 - 1, 2, arg0);
				method220(arg1, 8, arg0 - 1);
			}
		}

		if (arg2) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					method220(arg1, 0x10000, arg0);
					method220(arg1, 4096, arg0 - 1);
				}

				if (arg3 == 1) {
					method220(arg1, 1024, arg0);
					method220(arg1 + 1, 16384, arg0);
				}

				if (arg3 == 2) {
					method220(arg1, 4096, arg0);
					method220(arg1, 0x10000, arg0 + 1);
				}

				if (arg3 == 3) {
					method220(arg1, 16384, arg0);
					method220(arg1 - 1, 1024, arg0);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					method220(arg1, 512, arg0);
					method220(arg1 + 1, 8192, arg0 - 1);
				}

				if (arg3 == 1) {
					method220(arg1, 2048, arg0);
					method220(arg1 + 1, 32768, arg0 + 1);
				}

				if (arg3 == 2) {
					method220(arg1, 8192, arg0);
					method220(arg1 - 1, 512, arg0 + 1);
				}

				if (arg3 == 3) {
					method220(arg1, 32768, arg0);
					method220(arg1 - 1, 2048, arg0 - 1);
				}
			}

			if (arg4 == 2) {
				if (arg3 == 0) {
					method220(arg1, 66560, arg0);
					method220(arg1, 4096, arg0 - 1);
					method220(arg1 + 1, 16384, arg0);
				}

				if (arg3 == 1) {
					method220(arg1, 5120, arg0);
					method220(arg1 + 1, 16384, arg0);
					method220(arg1, 0x10000, arg0 + 1);
				}

				if (arg3 == 2) {
					method220(arg1, 20480, arg0);
					method220(arg1, 0x10000, arg0 + 1);
					method220(arg1 - 1, 1024, arg0);
				}

				if (arg3 == 3) {
					method220(arg1, 81920, arg0);
					method220(arg1 - 1, 1024, arg0);
					method220(arg1, 4096, arg0 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("GQSCEHQI.a(IIIIZIZ)V")
	public void method219(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg3 -= field732;
		arg0 -= field733;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg5;
			arg5 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg3; var9 < arg3 + arg5; var9++) {
			if (var9 >= 0 && var9 < field734) {
				for (int var10 = arg0; var10 < arg0 + arg1; var10++) {
					if (var10 >= 0 && var10 < field735) {
						method220(var10, var7, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("GQSCEHQI.a(IIII)V")
	public void method220(int arg0, int arg1, int arg2) {
		field736[arg2][arg0] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("GQSCEHQI.c(III)V")
	public void method221(int arg0, int arg1) {
		arg0 -= field732;
		arg1 -= field733;
		field736[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("GQSCEHQI.a(IIIIIII)Z")
	public boolean method222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg2 && arg1 == arg5) {
			return true;
		}

		arg2 -= field732;
		arg5 -= field733;
		arg0 -= field732;
		arg1 -= field733;
		if (arg4 == 0) {
			if (arg3 == 0) {
				if (arg0 - 1 == arg2 && arg1 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg1 + 1 == arg5 && (field736[arg2][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg1 - 1 == arg5 && (field736[arg2][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg0 == arg2 && arg1 + 1 == arg5) {
					return true;
				}

				if (arg0 - 1 == arg2 && arg1 == arg5 && (field736[arg2][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg1 == arg5 && (field736[arg2][arg5] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg0 + 1 == arg2 && arg1 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg1 + 1 == arg5 && (field736[arg2][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg1 - 1 == arg5 && (field736[arg2][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg0 == arg2 && arg1 - 1 == arg5) {
					return true;
				}

				if (arg0 - 1 == arg2 && arg1 == arg5 && (field736[arg2][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg1 == arg5 && (field736[arg2][arg5] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg3 == 0) {
				if (arg0 - 1 == arg2 && arg1 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg1 + 1 == arg5) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg1 == arg5 && (field736[arg2][arg5] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg1 - 1 == arg5 && (field736[arg2][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg0 - 1 == arg2 && arg1 == arg5 && (field736[arg2][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg1 + 1 == arg5) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg1 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg1 - 1 == arg5 && (field736[arg2][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg0 - 1 == arg2 && arg1 == arg5 && (field736[arg2][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg1 + 1 == arg5 && (field736[arg2][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg1 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg1 - 1 == arg5) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg0 - 1 == arg2 && arg1 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg1 + 1 == arg5 && (field736[arg2][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg1 == arg5 && (field736[arg2][arg5] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg1 - 1 == arg5) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg0 == arg2 && arg1 + 1 == arg5 && (field736[arg2][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg2 && arg1 - 1 == arg5 && (field736[arg2][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg2 && arg1 == arg5 && (field736[arg2][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg2 && arg1 == arg5 && (field736[arg2][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("GQSCEHQI.b(IIIIIII)Z")
	public boolean method223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg5 && arg0 == arg4) {
			return true;
		}

		arg3 -= field732;
		arg0 -= field733;
		arg5 -= field732;
		arg4 -= field733;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}

			if (arg2 == 0) {
				if (arg5 + 1 == arg3 && arg0 == arg4 && (field736[arg3][arg0] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg4 - 1 == arg0 && (field736[arg3][arg0] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg5 - 1 == arg3 && arg0 == arg4 && (field736[arg3][arg0] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg4 - 1 == arg0 && (field736[arg3][arg0] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg5 - 1 == arg3 && arg0 == arg4 && (field736[arg3][arg0] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg4 + 1 == arg0 && (field736[arg3][arg0] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg5 + 1 == arg3 && arg0 == arg4 && (field736[arg3][arg0] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg4 + 1 == arg0 && (field736[arg3][arg0] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 8) {
			if (arg3 == arg5 && arg4 + 1 == arg0 && (field736[arg3][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg5 && arg4 - 1 == arg0 && (field736[arg3][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg3 && arg0 == arg4 && (field736[arg3][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg3 && arg0 == arg4 && (field736[arg3][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("GQSCEHQI.a(IIIIIIII)Z")
	public boolean method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg4 + arg5 - 1;
		int var9 = arg1 + arg3 - 1;
		if (arg6 >= arg4 && arg6 <= var8 && arg0 >= arg3 && arg0 <= var9) {
			return true;
		}

		if (arg4 - 1 == arg6 && arg0 >= arg3 && arg0 <= var9 && (field736[arg6 - field732][arg0 - field733] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg6 && arg0 >= arg3 && arg0 <= var9 && (field736[arg6 - field732][arg0 - field733] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		}

		if (arg3 - 1 == arg0 && arg6 >= arg4 && arg6 <= var8 && (field736[arg6 - field732][arg0 - field733] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg0 && arg6 >= arg4 && arg6 <= var8 && (field736[arg6 - field732][arg0 - field733] & 0x20) == 0 && (arg2 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
