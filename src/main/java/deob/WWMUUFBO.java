package deob;

@ObfuscatedName("WWMUUFBO")
public class WWMUUFBO {

	@ObfuscatedName("WWMUUFBO.f")
	public int field1357 = 0;

	@ObfuscatedName("WWMUUFBO.g")
	public int field1358 = 0;

	@ObfuscatedName("WWMUUFBO.h")
	public int field1359;

	@ObfuscatedName("WWMUUFBO.i")
	public int field1360;

	@ObfuscatedName("WWMUUFBO.j")
	public int[][] field1361;

	public WWMUUFBO(int arg0, int arg1) {
		field1359 = arg0;
		field1360 = arg1;
		field1361 = new int[field1359][field1360];
		method528();
	}

	@ObfuscatedName("WWMUUFBO.a()V")
	public void method528() {
		for (int var1 = 0; var1 < field1359; var1++) {
			for (int var2 = 0; var2 < field1360; var2++) {
				if (var1 == 0 || var2 == 0 || field1359 - 1 == var1 || field1360 - 1 == var2) {
					field1361[var1][var2] = 0xFFFFFF;
				} else {
					field1361[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("WWMUUFBO.a(IIIIIZ)V")
	public void method529(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg0 -= field1357;
		arg3 -= field1358;
		if (arg1 == 0) {
			if (arg2 == 0) {
				method532(arg0, arg3, 128);
				method532(arg0 - 1, arg3, 8);
			}

			if (arg2 == 1) {
				method532(arg0, arg3, 2);
				method532(arg0, arg3 + 1, 32);
			}

			if (arg2 == 2) {
				method532(arg0, arg3, 8);
				method532(arg0 + 1, arg3, 128);
			}

			if (arg2 == 3) {
				method532(arg0, arg3, 32);
				method532(arg0, arg3 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				method532(arg0, arg3, 1);
				method532(arg0 - 1, arg3 + 1, 16);
			}

			if (arg2 == 1) {
				method532(arg0, arg3, 4);
				method532(arg0 + 1, arg3 + 1, 64);
			}

			if (arg2 == 2) {
				method532(arg0, arg3, 16);
				method532(arg0 + 1, arg3 - 1, 1);
			}

			if (arg2 == 3) {
				method532(arg0, arg3, 64);
				method532(arg0 - 1, arg3 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg2 == 0) {
				method532(arg0, arg3, 130);
				method532(arg0 - 1, arg3, 8);
				method532(arg0, arg3 + 1, 32);
			}

			if (arg2 == 1) {
				method532(arg0, arg3, 10);
				method532(arg0, arg3 + 1, 32);
				method532(arg0 + 1, arg3, 128);
			}

			if (arg2 == 2) {
				method532(arg0, arg3, 40);
				method532(arg0 + 1, arg3, 128);
				method532(arg0, arg3 - 1, 2);
			}

			if (arg2 == 3) {
				method532(arg0, arg3, 160);
				method532(arg0, arg3 - 1, 2);
				method532(arg0 - 1, arg3, 8);
			}
		}

		if (arg4) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					method532(arg0, arg3, 0x10000);
					method532(arg0 - 1, arg3, 4096);
				}

				if (arg2 == 1) {
					method532(arg0, arg3, 1024);
					method532(arg0, arg3 + 1, 16384);
				}

				if (arg2 == 2) {
					method532(arg0, arg3, 4096);
					method532(arg0 + 1, arg3, 0x10000);
				}

				if (arg2 == 3) {
					method532(arg0, arg3, 16384);
					method532(arg0, arg3 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					method532(arg0, arg3, 512);
					method532(arg0 - 1, arg3 + 1, 8192);
				}

				if (arg2 == 1) {
					method532(arg0, arg3, 2048);
					method532(arg0 + 1, arg3 + 1, 32768);
				}

				if (arg2 == 2) {
					method532(arg0, arg3, 8192);
					method532(arg0 + 1, arg3 - 1, 512);
				}

				if (arg2 == 3) {
					method532(arg0, arg3, 32768);
					method532(arg0 - 1, arg3 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg2 == 0) {
					method532(arg0, arg3, 66560);
					method532(arg0 - 1, arg3, 4096);
					method532(arg0, arg3 + 1, 16384);
				}

				if (arg2 == 1) {
					method532(arg0, arg3, 5120);
					method532(arg0, arg3 + 1, 16384);
					method532(arg0 + 1, arg3, 0x10000);
				}

				if (arg2 == 2) {
					method532(arg0, arg3, 20480);
					method532(arg0 + 1, arg3, 0x10000);
					method532(arg0, arg3 - 1, 1024);
				}

				if (arg2 == 3) {
					method532(arg0, arg3, 81920);
					method532(arg0, arg3 - 1, 1024);
					method532(arg0 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("WWMUUFBO.a(IIIIIZI)V")
	public void method530(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg2 -= field1357;
		arg5 -= field1358;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg1;
			arg1 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg2; var9 < arg1 + arg2; var9++) {
			if (var9 >= 0 && var9 < field1359) {
				for (int var10 = arg5; var10 < arg3 + arg5; var10++) {
					if (var10 >= 0 && var10 < field1360) {
						method532(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("WWMUUFBO.a(IIB)V")
	public void method531(int arg0, int arg1) {
		arg1 -= field1357;
		arg0 -= field1358;
		field1361[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("WWMUUFBO.a(III)V")
	public void method532(int arg0, int arg1, int arg2) {
		field1361[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("WWMUUFBO.a(ZIZIII)V")
	public void method533(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg2 -= field1357;
		arg4 -= field1358;
		if (arg3 == 0) {
			if (arg1 == 0) {
				method535(arg4, arg2, 128);
				method535(arg4, arg2 - 1, 8);
			}

			if (arg1 == 1) {
				method535(arg4, arg2, 2);
				method535(arg4 + 1, arg2, 32);
			}

			if (arg1 == 2) {
				method535(arg4, arg2, 8);
				method535(arg4, arg2 + 1, 128);
			}

			if (arg1 == 3) {
				method535(arg4, arg2, 32);
				method535(arg4 - 1, arg2, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				method535(arg4, arg2, 1);
				method535(arg4 + 1, arg2 - 1, 16);
			}

			if (arg1 == 1) {
				method535(arg4, arg2, 4);
				method535(arg4 + 1, arg2 + 1, 64);
			}

			if (arg1 == 2) {
				method535(arg4, arg2, 16);
				method535(arg4 - 1, arg2 + 1, 1);
			}

			if (arg1 == 3) {
				method535(arg4, arg2, 64);
				method535(arg4 - 1, arg2 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg1 == 0) {
				method535(arg4, arg2, 130);
				method535(arg4, arg2 - 1, 8);
				method535(arg4 + 1, arg2, 32);
			}

			if (arg1 == 1) {
				method535(arg4, arg2, 10);
				method535(arg4 + 1, arg2, 32);
				method535(arg4, arg2 + 1, 128);
			}

			if (arg1 == 2) {
				method535(arg4, arg2, 40);
				method535(arg4, arg2 + 1, 128);
				method535(arg4 - 1, arg2, 2);
			}

			if (arg1 == 3) {
				method535(arg4, arg2, 160);
				method535(arg4 - 1, arg2, 2);
				method535(arg4, arg2 - 1, 8);
			}
		}

		if (arg0) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					method535(arg4, arg2, 0x10000);
					method535(arg4, arg2 - 1, 4096);
				}

				if (arg1 == 1) {
					method535(arg4, arg2, 1024);
					method535(arg4 + 1, arg2, 16384);
				}

				if (arg1 == 2) {
					method535(arg4, arg2, 4096);
					method535(arg4, arg2 + 1, 0x10000);
				}

				if (arg1 == 3) {
					method535(arg4, arg2, 16384);
					method535(arg4 - 1, arg2, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					method535(arg4, arg2, 512);
					method535(arg4 + 1, arg2 - 1, 8192);
				}

				if (arg1 == 1) {
					method535(arg4, arg2, 2048);
					method535(arg4 + 1, arg2 + 1, 32768);
				}

				if (arg1 == 2) {
					method535(arg4, arg2, 8192);
					method535(arg4 - 1, arg2 + 1, 512);
				}

				if (arg1 == 3) {
					method535(arg4, arg2, 32768);
					method535(arg4 - 1, arg2 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg1 == 0) {
					method535(arg4, arg2, 66560);
					method535(arg4, arg2 - 1, 4096);
					method535(arg4 + 1, arg2, 16384);
				}

				if (arg1 == 1) {
					method535(arg4, arg2, 5120);
					method535(arg4 + 1, arg2, 16384);
					method535(arg4, arg2 + 1, 0x10000);
				}

				if (arg1 == 2) {
					method535(arg4, arg2, 20480);
					method535(arg4, arg2 + 1, 0x10000);
					method535(arg4 - 1, arg2, 1024);
				}

				if (arg1 == 3) {
					method535(arg4, arg2, 81920);
					method535(arg4 - 1, arg2, 1024);
					method535(arg4, arg2 - 1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("WWMUUFBO.a(BIIIIIZ)V")
	public void method534(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg0 -= field1357;
		arg2 -= field1358;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg4;
			arg4 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg4; var9++) {
			if (var9 >= 0 && var9 < field1359) {
				for (int var10 = arg2; var10 < arg1 + arg2; var10++) {
					if (var10 >= 0 && var10 < field1360) {
						method535(var10, var9, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("WWMUUFBO.a(IIIZ)V")
	public void method535(int arg0, int arg1, int arg2) {
		field1361[arg1][arg0] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("WWMUUFBO.a(IZI)V")
	public void method536(int arg0, int arg1) {
		arg1 -= field1357;
		arg0 -= field1358;
		field1361[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("WWMUUFBO.a(IIIIIII)Z")
	public boolean method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg4 && arg3 == arg5) {
			return true;
		}

		arg4 -= field1357;
		arg3 -= field1358;
		arg0 -= field1357;
		arg5 -= field1358;
		if (arg1 == 0) {
			if (arg2 == 0) {
				if (arg0 - 1 == arg4 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg3 && (field1361[arg4][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg3 && (field1361[arg4][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg0 == arg4 && arg5 + 1 == arg3) {
					return true;
				}

				if (arg0 - 1 == arg4 && arg3 == arg5 && (field1361[arg4][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg3 == arg5 && (field1361[arg4][arg3] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg0 + 1 == arg4 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg3 && (field1361[arg4][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg3 && (field1361[arg4][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg0 == arg4 && arg5 - 1 == arg3) {
					return true;
				}

				if (arg0 - 1 == arg4 && arg3 == arg5 && (field1361[arg4][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg3 == arg5 && (field1361[arg4][arg3] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 2) {
			if (arg2 == 0) {
				if (arg0 - 1 == arg4 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg3) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg3 == arg5 && (field1361[arg4][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg3 && (field1361[arg4][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg0 - 1 == arg4 && arg3 == arg5 && (field1361[arg4][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg3) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg3 && (field1361[arg4][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg0 - 1 == arg4 && arg3 == arg5 && (field1361[arg4][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg3 && (field1361[arg4][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg3) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg0 - 1 == arg4 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg3 && (field1361[arg4][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg3 == arg5 && (field1361[arg4][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg1 == 9) {
			if (arg0 == arg4 && arg5 + 1 == arg3 && (field1361[arg4][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg4 && arg5 - 1 == arg3 && (field1361[arg4][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg4 && arg3 == arg5 && (field1361[arg4][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg4 && arg3 == arg5 && (field1361[arg4][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("WWMUUFBO.b(IIIIIII)Z")
	public boolean method538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg5 && arg2 == arg4) {
			return true;
		}

		arg5 -= field1357;
		arg4 -= field1358;
		arg1 -= field1357;
		arg2 -= field1358;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}

			if (arg3 == 0) {
				if (arg1 + 1 == arg5 && arg2 == arg4 && (field1361[arg5][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg4 && (field1361[arg5][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg1 - 1 == arg5 && arg2 == arg4 && (field1361[arg5][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg4 && (field1361[arg5][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg1 - 1 == arg5 && arg2 == arg4 && (field1361[arg5][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg4 && (field1361[arg5][arg4] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg1 + 1 == arg5 && arg2 == arg4 && (field1361[arg5][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg4 && (field1361[arg5][arg4] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 8) {
			if (arg1 == arg5 && arg2 + 1 == arg4 && (field1361[arg5][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg5 && arg2 - 1 == arg4 && (field1361[arg5][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg5 && arg2 == arg4 && (field1361[arg5][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg5 && arg2 == arg4 && (field1361[arg5][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("WWMUUFBO.a(BIIIIIII)Z")
	public boolean method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg3 - 1;
		int var9 = arg0 + arg5 - 1;
		if (arg6 >= arg3 && arg6 <= var8 && arg4 >= arg5 && arg4 <= var9) {
			return true;
		}

		if (arg3 - 1 == arg6 && arg4 >= arg5 && arg4 <= var9 && (field1361[arg6 - field1357][arg4 - field1358] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg6 && arg4 >= arg5 && arg4 <= var9 && (field1361[arg6 - field1357][arg4 - field1358] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		}

		if (arg5 - 1 == arg4 && arg6 >= arg3 && arg6 <= var8 && (field1361[arg6 - field1357][arg4 - field1358] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg6 >= arg3 && arg6 <= var8 && (field1361[arg6 - field1357][arg4 - field1358] & 0x20) == 0 && (arg1 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
